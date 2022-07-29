package com.ap.slowquery.service;

import com.ap.slowquery.entity.Book;
import com.ap.slowquery.sro.BookSro;

import java.util.List;

public interface BookService {

    List<BookSro> getAllBook();
    Book save(Book book);
}
