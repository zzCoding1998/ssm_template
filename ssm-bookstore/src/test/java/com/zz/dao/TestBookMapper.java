package com.zz.dao;

import com.zz.pojo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestBookMapper {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testGetBookList() {
        List<Book> bookList = bookMapper.getBookList();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
