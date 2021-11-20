package com.zz.dao;

import com.zz.pojo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookMapper {

    Book getBookById(Integer id);

    List<Book> getBookList();

    Integer addBook(Book book);

    Integer removeBook(Integer id);

    Integer updateBook(Book book);

}
