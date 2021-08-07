package com.github.jiantailang.book;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Book {
    private long id;
    private String title;
    private long authorId;
}
