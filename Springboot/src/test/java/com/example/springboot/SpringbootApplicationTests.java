package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
class SpringbootApplicationTests {
    public static void main(String[] args) {
        /*SpringApplication.run(SpringbootApplicationTests.class,args);
    }

    @Test
    void contextLoads() {*/
    }

}
