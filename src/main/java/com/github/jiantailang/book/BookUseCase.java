package com.github.jiantailang.book;

public interface BookUseCase {
    Book get(long id);
    void put(Book book);
    void delete(long id);
}
