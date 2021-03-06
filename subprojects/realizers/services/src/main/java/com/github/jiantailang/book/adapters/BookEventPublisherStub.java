package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.Event;
import com.github.jiantailang.book.ports.BookEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Prepare the adapter stub.
 * Non-required adapter do nothing.
 */
@Component
public class BookEventPublisherStub implements BookEventPublisher {

    @Override
    public void publish(Event event, Book book) {
        // do nothing
    }
}
