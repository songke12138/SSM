package com.demo.controller;

import com.demo.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.pojo.Book;

/**
 * @Author: SongKe
 * @Date: 2019/9/3 16:02
 */
@Controller
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @ResponseBody
    @RequestMapping("/book/{isbn}")
    public Book findAllById(@PathVariable String isbn){
        return bookService.findByIsbn(isbn);
    }

}
