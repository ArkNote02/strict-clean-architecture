package com.github.jiantailang.book.adapters.dynamodb.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@Configuration
public class DynamoDbClientConfiguration {

    @Bean
    public DynamoDbEnhancedClient dynamoDbEnhancedClient() {
        return DynamoDbEnhancedClient.builder()
                .dynamoDbClient(
                        DynamoDbClient.builder()
                                //.endpointOverride(URI.create("http://localhost:4566/"))
                                .region(Region.AP_NORTHEAST_1)
                                .build())
                .build();
    }
}
