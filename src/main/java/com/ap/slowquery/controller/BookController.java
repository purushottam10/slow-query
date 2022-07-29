package com.ap.slowquery.controller;

import com.ap.slowquery.entity.Book;
import com.ap.slowquery.sro.BookSro;
import com.ap.slowquery.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public ResponseEntity<List<BookSro>> getAllUser() {
        return new ResponseEntity(bookService.getAllBook(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Book> saveUser(@RequestBody Book book) {
        return new ResponseEntity(bookService.save(book), HttpStatus.OK);
    }
}
