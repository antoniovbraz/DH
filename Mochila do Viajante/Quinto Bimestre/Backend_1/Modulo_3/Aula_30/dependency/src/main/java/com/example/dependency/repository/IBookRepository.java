package com.example.dependency.repository;

import java.util.List;

public interface IBookRepository<T> {
    public List<T> listAllBooks();

}
