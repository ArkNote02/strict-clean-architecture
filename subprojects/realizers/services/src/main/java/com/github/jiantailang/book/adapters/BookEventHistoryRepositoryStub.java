package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.BookEvent;
import com.github.jiantailang.book.ports.BookEventHistoryRepository;
import org.springframework.stereotype.Component;

/**
 * Prepare the adapter stub.
 * Non-required adapter do nothing.
 */
@Component
public class BookEventHistoryRepositoryStub implements BookEventHistoryRepository {

    @Override
    public void put(BookEvent event) {
        // do nothing
    }
}
