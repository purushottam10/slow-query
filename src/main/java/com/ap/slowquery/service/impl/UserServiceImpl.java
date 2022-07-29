package com.ap.slowquery.service.impl;

import com.ap.slowquery.entity.Book;
import com.ap.slowquery.entity.DemoUser;
import com.ap.slowquery.repository.UseRepository;
import com.ap.slowquery.service.BookService;
import com.ap.slowquery.service.UseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UseService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UseRepository useRepository;
    @Autowired
    private BookService bookService;
    @Transactional(readOnly = true)
    @Override
    public Optional<List<DemoUser>> getAllUser() {
        return useRepository.getAllUser();
    }

    @Transactional
    @Override
    public DemoUser save(DemoUser demoUser) {
        try{
            demoUser = useRepository.save(demoUser);
            log.info(" thread sleep start time {}",new Date());
            //Thread.sleep(60000);
            log.info(" thread sleep end time {}",new Date());
        }catch (Exception ex){
            ex.getLocalizedMessage();
        }
        return demoUser;
    }
    private Book getBook(){
        Book book= new Book();
        book.setName("Concept of phy");
        book.setPrice(220.0);
        return book;
    }


}
