package com.github.jiantailang.book.adapters.dynamodb;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.adapters.dynamodb.models.DynamoDbBook;
import com.github.jiantailang.book.ports.BookRepository;
import lombok.RequiredArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;

@RequiredArgsConstructor
public class DynamoDbBookAdapter implements BookRepository {

    private final DynamoDbTable<DynamoDbBook> dynamoDbBookTable;

    @Override
    public Book get(long id) {
        DynamoDbBook dynamoDbBook = dynamoDbBookTable.getItem(
                Key.builder()
                        .partitionValue(id)
                        .build());
        return dynamoDbBook.toBook();
    }

    @Override
    public void put(Book book) {
        dynamoDbBookTable.putItem(DynamoDbBook.of(book));
    }
}
