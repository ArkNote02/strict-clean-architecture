package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.BookEvent;
import com.github.jiantailang.book.ports.BookEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Prepare the adapter stub.
 * Non-required adapter do nothing.
 */
@Component
public class BookEventPublisherStub implements BookEventPublisher {

    @Override
    public void publish(BookEvent event, Book book) {
        // do nothing
    }
}
