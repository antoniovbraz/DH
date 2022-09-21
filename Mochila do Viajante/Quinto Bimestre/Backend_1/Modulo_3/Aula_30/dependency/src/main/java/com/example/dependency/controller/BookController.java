package com.example.dependency.controller;

import com.example.dependency.entity.BookEntity;
import com.example.dependency.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/books")
    public List<BookEntity> listAllBooks(){
        return bookService.listAllBooks();
    }
}
