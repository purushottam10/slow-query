package com.ap.slowquery.repository.impl;

import com.ap.slowquery.entity.DemoUser;
import com.ap.slowquery.repository.BookRepository;
import com.ap.slowquery.repository.UseRepository;
import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;
import java.util.Optional;


@Repository

public class UseRepositoryImpl implements UseRepository {
    private static final Logger log = LoggerFactory.getLogger(UseRepositoryImpl.class);
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private BookRepository bookRepository;
    //@PersistenceContext
//    @Autowired
//    private EntityManager sessionFactory;
    @Override
    public Optional<List<DemoUser>> getAllUser() {
//        Query query = sessionFactory.getCurrentSession().createQuery("from demo_user");
        Query query =sessionFactory.getCurrentSession().createQuery("from demo_user");
        return Optional.ofNullable(query.getResultList());
    }


    @Override
    public DemoUser save(DemoUser demoUser) {
        try {
            //sessionFactory.getCurrentSession().saveOrUpdate(demoUser);
            sessionFactory.getCurrentSession().saveOrUpdate(demoUser);
            sessionFactory.getCurrentSession().clear();
//            sessionFactory.getCurrentSession().evict(demoUser);
//            sessionFactory.clear();
            log.info("saved demoUser {}", demoUser);
           // Thread.sleep(60000);
        }catch (Exception e){
            e.getLocalizedMessage();
        }
        return demoUser;

    }
}
