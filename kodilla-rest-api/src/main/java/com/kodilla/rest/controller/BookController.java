package com.kodilla.rest.controller;

import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @DeleteMapping
    public String deleteBook(@RequestBody BookDto book) {
        boolean removed = bookService.removeBook(book);
        if (removed) {
            return "Book usunieta";
        } else {
            return "Book not found.";
        }
    }
}