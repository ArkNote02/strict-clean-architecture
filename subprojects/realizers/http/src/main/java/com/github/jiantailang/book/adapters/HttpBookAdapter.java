package com.github.jiantailang.book.adapters;

import com.github.jiantailang.book.BookUseCase;
import com.github.jiantailang.book.adapters.models.HttpBook;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HttpBookAdapter {

    private final BookUseCase useCase;

    @GetMapping("/book/{id}")
    @ResponseBody
    public HttpBook get(@PathVariable("id") long id) {
        return HttpBook.of(useCase.get(id));
    }

    @PutMapping("/book/")
    public HttpBook put(@RequestBody HttpBook book) {
        useCase.put(book.toBook());
        return book;
    }

    @DeleteMapping("/book/")
    public HttpBook delete(@RequestBody HttpBook book) {
        useCase.delete(book.getId());
        return book;
    }
}
