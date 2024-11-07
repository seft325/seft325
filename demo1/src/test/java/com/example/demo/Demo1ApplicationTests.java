package com.example.demo;

import com.example.demo.doto.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void testadd(){

        BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book);


    }

}
