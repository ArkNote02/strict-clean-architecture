package com.github.jiantailang.book.ports;

import com.github.jiantailang.book.Book;

public interface BookRepository {
    Book get(long id);
    void put(Book book);
}
