package com.github.jiantailang.book.adapters.s3;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.BookEvent;
import com.github.jiantailang.book.ports.BookEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class S3BookAdapter implements BookEventPublisher {

    @Override
    public void publish(BookEvent event, Book book) {

    }
}
