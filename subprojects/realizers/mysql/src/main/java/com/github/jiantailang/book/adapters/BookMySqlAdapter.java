package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.ports.BookRepository;

public class BookMySqlAdapter implements BookRepository {

    @Override
    public Book get(long id) {
        return null;
    }

    @Override
    public void put(Book book) {

    }
}
