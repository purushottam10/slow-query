package com.ap.slowquery.repository.impl;

import com.ap.slowquery.entity.Book;
import com.ap.slowquery.repository.BookRepository;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @Autowired
    private SessionFactory sessionFactory;
private static final Logger log = LoggerFactory.getLogger(BookRepositoryImpl.class);

//    @Autowired
//private EntityManager sessionFactory;
    @Override
    public Optional<List<Book>> getAllBook() {
        return Optional.ofNullable(sessionFactory.getCurrentSession().createQuery("from book").getResultList());
    }

    @Override
    public Book save(Book book) {
        sessionFactory.getCurrentSession().saveOrUpdate(book);
        //sessionFactory.getCurrentSession().evict();
        log.info("saved books {}",book);
        return book;
    }
}
