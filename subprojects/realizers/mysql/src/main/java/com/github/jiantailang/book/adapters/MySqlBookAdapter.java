package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.ports.BookRepository;

public class MySqlBookAdapter implements BookRepository {

    @Override
    public Book get(long id) {
        return null;
    }

    @Override
    public void put(Book book) {

    }

    @Override
    public Book delete(long id) {
        return null;
    }
}
