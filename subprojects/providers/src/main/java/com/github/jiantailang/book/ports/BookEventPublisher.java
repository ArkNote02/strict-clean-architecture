package com.github.jiantailang.book.ports;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.Event;

public interface BookEventPublisher {
    void publish(Event event, Book book);
}
