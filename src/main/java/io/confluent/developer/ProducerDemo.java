package io.confluent.developer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class ProducerDemo {

    private static final Logger log = LoggerFactory.getLogger(ProducerDemo.class);
    public static void main(String[] args) throws IOException {

        //create Producer Properties
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
        String topic = "demo_java";

        File file = FileUtils.getFile("data/events.json");
        LineIterator lineIterator = FileUtils.lineIterator(file);
        System.out.println("Contents of json");
        try {
            while(lineIterator.hasNext()) {

                ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topic, lineIterator.nextLine());
                producer.send(producerRecord);

            }
        } finally {
            lineIterator.close();
        }

        producer.flush();

        producer.close();
    }
}

