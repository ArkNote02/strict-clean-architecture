package com.github.jiantailang.book;

public interface BookUseCase {
    Book take(long id);
    void put(Book book);
}
