package com.example.dependency.service;

import java.util.List;

public interface IBookService<T> {
    public List<T> listAllBooks();
}
