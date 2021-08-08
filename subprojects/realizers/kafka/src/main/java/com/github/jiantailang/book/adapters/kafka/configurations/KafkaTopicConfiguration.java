package com.github.jiantailang.book.adapters.kafka.configurations;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic bookEventTopic() {
        return TopicBuilder
                .name("book-event")
                .partitions(3)
                .replicas(3)
                .build();
    }
}
