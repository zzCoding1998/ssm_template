package com.zz.service;

import com.zz.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestBookService {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @Test
    public void testGetBookList() {

        List<Book> bookList = bookService.getBookList();

        for (Book book : bookList) {
            System.out.println(book);
        }
    }

}
