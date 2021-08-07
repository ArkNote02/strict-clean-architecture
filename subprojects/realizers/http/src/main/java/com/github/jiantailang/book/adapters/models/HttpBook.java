package com.github.jiantailang.book.adapters.models;

import com.github.jiantailang.book.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class HttpBook {

    private long id;
    private String title;
    private long authorId;

    public static HttpBook of(Book book) {
        return HttpBook.builder()
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
