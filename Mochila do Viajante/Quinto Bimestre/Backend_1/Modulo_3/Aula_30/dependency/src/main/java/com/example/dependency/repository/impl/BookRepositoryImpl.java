package com.example.dependency.repository.impl;

import com.example.dependency.entity.BookEntity;
import com.example.dependency.repository.IBookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements IBookRepository {
    @Override
    public List<BookEntity> listAllBooks(){
        List<BookEntity> bookEntityList = new ArrayList<>();
        bookEntityList.add(new BookEntity(1,"As armas da persuasão 2.0", "Robert B. Cialdini"));
        bookEntityList.add(new BookEntity(2,"Start with Why", "Simon Sinek"));
        return bookEntityList;
    }
}
