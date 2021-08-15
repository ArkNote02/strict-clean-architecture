package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.BookEvent;
import com.github.jiantailang.book.ports.BookEventNotifier;
import org.springframework.stereotype.Component;

/**
 * Prepare the adapter stub.
 * Non-required adapter do nothing.
 */
@Component
public class BookEventNotifierStub implements BookEventNotifier {

    @Override
    public void notifyOf(BookEvent event) {
        // do nothing
    }
}
