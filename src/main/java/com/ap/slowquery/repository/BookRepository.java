package com.ap.slowquery.repository;

import com.ap.slowquery.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    Optional<List<Book>> getAllBook();
    Book save(Book book);
}
