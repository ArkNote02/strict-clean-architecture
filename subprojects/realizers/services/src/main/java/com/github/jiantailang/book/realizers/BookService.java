package com.github.jiantailang.book.realizers;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.BookEvent;
import com.github.jiantailang.book.BookUseCase;
import com.github.jiantailang.book.ports.BookEventPublisher;
import com.github.jiantailang.book.ports.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BookService implements BookUseCase {

    private final BookRepository repository;
    private final BookEventPublisher eventPublisher;

    @Override
    public Book get(long id) {
        Book book = repository.get(id);
        eventPublisher.publish(BookEvent.GET, book);
        return book;
    }

    @Override
    public void put(Book book) {
        repository.put(book);
        eventPublisher.publish(BookEvent.PUT, book);
    }
}
