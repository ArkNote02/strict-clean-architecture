package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.Book;
import com.github.jiantailang.book.BookUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookHttpControlAdapter {

    private final BookUseCase useCase;

    @GetMapping("/")
    public String index() {
        return "Hello world.";
    }

    @GetMapping("/take/{id}")
    public String take(@PathVariable long id) {
        Book book = useCase.take(id);
        return book.toString();
    }

    @PostMapping("/put")
    public String put(Book book) {
        useCase.put(book);
        return "OK";
    }
}
