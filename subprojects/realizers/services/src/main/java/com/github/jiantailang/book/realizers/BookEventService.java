package com.github.jiantailang.book.realizers;

import com.github.jiantailang.book.BookEvent;
import com.github.jiantailang.book.BookEventUseCase;
import com.github.jiantailang.book.Event;
import com.github.jiantailang.book.ports.BookEventHistoryRepository;
import com.github.jiantailang.book.ports.BookEventNotifier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BookEventService implements BookEventUseCase {

    private final BookEventHistoryRepository historyRepository;
    private final BookEventNotifier notifier;

    @Override
    public void put(BookEvent event) {
        historyRepository.put(event);
        if (event.getEvent() != Event.GET) {
            notifier.notifyOf(event);
        }
    }
}
