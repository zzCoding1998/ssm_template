package com.zz.service.impl;

import com.zz.dao.BookMapper;
import com.zz.pojo.Book;
import com.zz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public List<Book> getBookList() {
        return bookMapper.getBookList();
    }

    @Override
    public Integer addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public Integer removeBook(Integer id) {
        return bookMapper.removeBook(id);
    }

    @Override
    public Integer updateBook(Book book) {
        return bookMapper.updateBook(book);
    }
}
