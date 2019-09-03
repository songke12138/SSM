package com.demo.service;

import com.demo.pojo.Book;

/**
 * @Author: SongKe
 * @Date: 2019/9/3 16:01
 */
public interface BookService {
    public Book findByIsbn(String isbn);
}
