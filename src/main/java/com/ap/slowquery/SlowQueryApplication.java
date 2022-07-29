package com.ap.slowquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SlowQueryApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SlowQueryApplication.class, args);
    }

}
