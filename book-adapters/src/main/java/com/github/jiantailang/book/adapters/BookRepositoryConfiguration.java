package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.ports.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class BookRepositoryConfiguration {

    // If adapter required beans, get from this.
//    private final ApplicationContext context;

    @ConditionalOnProperty(name = "book.repository", havingValue = "mysql", matchIfMissing = true)
    @Bean
    public BookRepository mySqlBookAdapter() {
        log.info("register a bean 'bookMySqlAdapter'");
        return new BookMySqlAdapter();
    }

    @ConditionalOnProperty(name = "book.repository", havingValue = "dynamodb")
    @Bean
    public BookRepository dynamoDbBookAdapter() {
        log.info("register a bean 'bookDynamoDbAdapter'");
        return new BookDynamoDbAdapter();
    }
}
