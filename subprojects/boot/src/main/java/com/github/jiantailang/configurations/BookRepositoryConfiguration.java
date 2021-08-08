package com.github.jiantailang.configurations;

import com.github.jiantailang.book.adapters.dynamodb.DynamoDbBookAdapter;
import com.github.jiantailang.book.adapters.MySqlBookAdapter;
import com.github.jiantailang.book.adapters.dynamodb.models.DynamoDbBook;
import com.github.jiantailang.book.ports.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;

@RequiredArgsConstructor
@Configuration
public class BookRepositoryConfiguration {

    private final DynamoDbTable<DynamoDbBook> dynamoDbTable;

    @ConditionalOnProperty(name = "book.repository", havingValue = "dynamodb", matchIfMissing = true)
    @Bean
    @Primary
    public BookRepository dynamoDbBookAdapter() {
        return new DynamoDbBookAdapter(dynamoDbTable);
    }

    @ConditionalOnProperty(name = "book.repository", havingValue = "mysql")
    @Bean
    @Primary
    public BookRepository mySqlBookAdapter() {
        return new MySqlBookAdapter();
    }
}
