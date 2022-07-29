package com.ap.slowquery.service.impl;

import com.ap.slowquery.entity.Book;
import com.ap.slowquery.sro.BookSro;
import com.ap.slowquery.repository.BookRepository;
import com.ap.slowquery.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Transactional
    @Override
    public List<BookSro> getAllBook() {
        List<BookSro> b = new ArrayList();
        bookRepository.getAllBook().get().forEach(s ->
                b.add(new BookSro(s)));
        return b;
    }


    @Transactional
    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
