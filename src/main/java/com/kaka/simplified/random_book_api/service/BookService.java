package com.kaka.simplified.random_book_api.service;

import com.github.javafaker.Book;
import com.github.javafaker.Faker;
import com.kaka.simplified.random_book_api.entity.FakeBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class BookService {
    private final Faker faker = new Faker(new Locale("en-US"));

    public FakeBook getRandomBook() {
        Book book = faker.book();
        return new FakeBook(book.title(), book.author(), book.genre(), book.publisher());
    }

    public List<FakeBook> getRandomBookBySize(int size) {
        List<FakeBook> books = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            books.add(getRandomBook());
        }
        return books;
    }
}
