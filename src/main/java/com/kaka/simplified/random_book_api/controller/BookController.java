package com.kaka.simplified.random_book_api.controller;

import com.kaka.simplified.random_book_api.entity.FakeBook;
import com.kaka.simplified.random_book_api.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<?> getRandomBook() {
        FakeBook book = bookService.getRandomBook();
        return ResponseEntity.ok(book);
    }

    @GetMapping("/{size}")
    public ResponseEntity<?> getRandomBooks(@PathVariable int size) {
        List<FakeBook> books = bookService.getRandomBookBySize(size);
        return ResponseEntity.status(HttpStatus.OK).body(books);
    }
}
