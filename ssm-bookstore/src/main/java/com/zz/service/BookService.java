package com.zz.service;

import com.zz.pojo.Book;

import java.util.List;

public interface BookService {

    Book getBookById(Integer id);
    List<Book> getBookList();
    Integer addBook(Book book);
    Integer removeBook(Integer id);
    Integer updateBook(Book book);
}
