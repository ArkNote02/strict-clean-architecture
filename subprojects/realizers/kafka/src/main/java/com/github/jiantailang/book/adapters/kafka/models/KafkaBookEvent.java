package com.github.jiantailang.book.adapters.kafka.models;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.BookEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class KafkaBookEvent {

    private String event;
    private long id;
    private String title;
    private long authorId;

    public static KafkaBookEvent of(BookEvent event, Book book) {
        return KafkaBookEvent.builder()
                .event(event.name())
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
}
