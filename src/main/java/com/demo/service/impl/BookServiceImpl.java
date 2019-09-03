package com.demo.service.impl;

import com.demo.dao.BookDao;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.pojo.Book;

/**
 * @Author: SongKe
 * @Date: 2019/9/3 16:01
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    public Book findByIsbn(String isbn) {
        return bookDao.findByIsbn(isbn);
    }
}
