package com.github.jiantailang.book.adapters.dynamodb.configurations;

import com.github.jiantailang.book.adapters.dynamodb.models.DynamoDbBook;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;

@RequiredArgsConstructor
@Configuration
public class DynamoDbTableConfiguration {

    private final static String TABLE_NAME = "book";
    private final DynamoDbEnhancedClient dynamoDbEnhancedClient;

    @Bean
    public DynamoDbTable<DynamoDbBook> dynamoDbBookTable() {
        return dynamoDbEnhancedClient.table(TABLE_NAME, TableSchema.fromBean(DynamoDbBook.class));
    }
}
