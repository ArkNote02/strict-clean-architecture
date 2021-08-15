package com.github.jiantailang.book;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

@Builder
@Value
public class BookEvent {
    private Event event;
    private LocalDateTime createdAt;
    private Book book;
}
