package com.github.jiantailang.configurations;

import com.github.jiantailang.book.adapters.dynamodb.BookDynamoDbAdapter;
import com.github.jiantailang.book.adapters.BookMySqlAdapter;
import com.github.jiantailang.book.adapters.dynamodb.models.DynamoDbBook;
import com.github.jiantailang.book.ports.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;

@Configuration
@RequiredArgsConstructor
public class BookRepositoryConfiguration {

    private final DynamoDbTable<DynamoDbBook> dynamoDbTable;

    @ConditionalOnProperty(name = "book.repository", havingValue = "dynamodb", matchIfMissing = true)
    @Bean
    public BookRepository dynamoDbBookAdapter() {
        return new BookDynamoDbAdapter(dynamoDbTable);
    }

    @ConditionalOnProperty(name = "book.repository", havingValue = "mysql")
    @Bean
    public BookRepository mySqlBookAdapter() {
        return new BookMySqlAdapter();
    }
}
