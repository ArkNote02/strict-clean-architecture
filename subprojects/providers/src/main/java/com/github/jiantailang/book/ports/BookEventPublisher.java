package com.github.jiantailang.book.ports;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.BookEvent;

public interface BookEventPublisher {
    void publish(BookEvent event, Book book);
}
