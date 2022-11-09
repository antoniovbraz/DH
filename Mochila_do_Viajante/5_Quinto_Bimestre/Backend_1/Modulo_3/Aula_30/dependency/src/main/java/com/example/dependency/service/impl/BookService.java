package com.example.dependency.service.impl;

import com.example.dependency.dto.BookDTO;
import com.example.dependency.entity.BookEntity;
import com.example.dependency.repository.IBookRepository;
import com.example.dependency.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<BookDTO> listAllBooks(){
    List<BookDTO> response;
    List<BookEntity> bookEntityList = this.bookRepository.listAllBooks();

    response = bookEntityList.stream().map(BookDTO::new).collect(Collectors.toList());
    return response;
    }
}
