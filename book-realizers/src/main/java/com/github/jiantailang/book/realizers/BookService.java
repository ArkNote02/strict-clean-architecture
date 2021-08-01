package com.github.jiantailang.book.realizers;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.BookUseCase;
import com.github.jiantailang.book.ports.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookService implements BookUseCase {

    private final BookRepository repository;

    @Override
    public Book take(long id) {
        return repository.get(id);
    }

    @Override
    public void put(Book book) {
        repository.save(book);
    }
}
