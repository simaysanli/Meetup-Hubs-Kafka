package io.confluent.developer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

public class ConsumerDemo {

    private static final Logger log = LoggerFactory.getLogger(ProducerDemo.class);
    public static void main(String[] args) {
        String bootstrapServers = "kafka-cluster:9092";
        String groupId = "my-application";
        String topic = "demo_java";

        //create consumer configs
        Properties properties = new Properties();
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        //create consumer
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);

        //get a reference to the current thread
        final Thread mainThread = Thread.currentThread();

        //adding shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                consumer.wakeup();

                //join the main thread to allow the execution of the code in the main thread
                try {
                    mainThread.join();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //subscribe consumer to our topic
        consumer.subscribe(Arrays.asList(topic));

        //poll for new data
        while(true) {
            ConsumerRecords<String, String>  records =
                    consumer.poll(Duration.ofMillis(1000));

            for(ConsumerRecord<String, String> record : records) {
                System.out.println(record.value());
            }

        }




    }
}

