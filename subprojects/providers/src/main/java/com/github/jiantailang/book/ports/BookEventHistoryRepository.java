package com.github.jiantailang.book.ports;

import com.github.jiantailang.book.BookEvent;

public interface BookEventHistoryRepository {
    void put(BookEvent event);
}
