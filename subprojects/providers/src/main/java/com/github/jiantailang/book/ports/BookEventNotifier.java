package com.github.jiantailang.book.ports;

import com.github.jiantailang.book.BookEvent;

public interface BookEventNotifier {
    void notifyOf(BookEvent event);
}
