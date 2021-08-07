package com.github.jiantailang.book.adapters.dynamodb.models;

import com.github.jiantailang.book.Book;
import lombok.*;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@DynamoDbBean
public class DynamoDbBook {

    private long id;
    private String title;
    private long authorId;

    public static DynamoDbBook of(Book book) {
        return DynamoDbBook.builder()
                .id(book.getId())
                .title(book.getTitle())
                .authorId(book.getAuthorId())
                .build();
    }

    public Book toBook() {
        return Book.builder()
                .id(getId())
                .title(getTitle())
                .authorId(getAuthorId())
                .build();
    }

    @DynamoDbPartitionKey
    public long getId() {
        return id;
    }
}
