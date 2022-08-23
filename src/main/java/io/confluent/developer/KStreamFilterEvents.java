package io.confluent.developer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.confluent.developer.json.schema.EventProcessing;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.*;
import org.apache.kafka.streams.kstream.KStream;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Properties;
import java.util.UUID;

public class KStreamFilterEvents {
    public void consumeData(String uuid) throws InterruptedException {
        String inputTopic = "x";
        Path stateDirectory;
        Properties streamsConfiguration = new Properties();
        streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, uuid);
        streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        streamsConfiguration.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String()
                .getClass()
                .getName());
        streamsConfiguration.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String()
                .getClass()
                .getName());
        streamsConfiguration.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 1000);
        streamsConfiguration.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");


        try {
            stateDirectory = Files.createTempDirectory("kafka-streams");
            streamsConfiguration.put(StreamsConfig.STATE_DIR_CONFIG, stateDirectory.toAbsolutePath()
                    .toString());
        } catch (final IOException e) {
            throw new UncheckedIOException("Cannot create temporary directory", e);
        }

        ObjectMapper mapper = new ObjectMapper();

        // when
        final StreamsBuilder builder = new StreamsBuilder();
        KStream<String, String> textLines = builder.stream(inputTopic);
        textLines.flatMapValues(value -> {
                    try {
                        return Arrays.asList(mapper.readValue(value, EventProcessing.class));
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                })
                .filter(((key, val) -> val.getGroup().getCountry().equalsIgnoreCase("de")))
                .filter(((key, val) -> val.getGroup().getCity().equalsIgnoreCase("München") || val.getGroup().getCity().equalsIgnoreCase("Munich")))
                .foreach((key, val) -> System.out.println(val.getUtcOffset() + " -> " + val.getGroup().getCountry() + " -> " + val.getGroup().getCity()));


        //System.out.println(val.getGroup().getCountry() + " -> " + val.getGroup().getCity())
        final Topology topology = builder.build();
        KafkaStreams streams = new KafkaStreams(topology, streamsConfiguration);
        streams.start();


        // then
        Thread.sleep(30000);
        streams.close();
    }


    public static void main(String[] args) throws InterruptedException {
        KStreamFilterEvents event = new KStreamFilterEvents();
        UUID uuid = UUID.randomUUID();
        event.consumeData(String.valueOf(uuid));
    }
}






