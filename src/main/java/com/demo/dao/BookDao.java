package com.demo.dao;


import com.demo.pojo.Book;

/**
 * @Author: SongKe
 * @Date: 2019/9/3 15:58
 */
public interface BookDao {

    public Book findByIsbn(String isbn);

}
