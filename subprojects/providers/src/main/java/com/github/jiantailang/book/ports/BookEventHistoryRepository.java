package com.github.jiantailang.book.ports;

import com.github.jiantailang.book.Book;

public interface BookEventHistoryRepository {
    void put(Book book);
}
