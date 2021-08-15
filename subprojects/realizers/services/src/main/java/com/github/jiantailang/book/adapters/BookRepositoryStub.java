package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.ports.BookRepository;
import org.springframework.stereotype.Component;

/**
 * Prepare the adapter stub.
 * Required adapter throw an UnsupportedOperationException.
 */
@Component
public class BookRepositoryStub implements BookRepository {

    @Override
    public Book get(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void put(Book book) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Book delete(long id) {
        throw new UnsupportedOperationException();
    }
}
