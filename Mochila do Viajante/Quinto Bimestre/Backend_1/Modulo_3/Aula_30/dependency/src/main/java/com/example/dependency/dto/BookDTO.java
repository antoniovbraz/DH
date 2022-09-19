package com.example.dependency.dto;

import com.example.dependency.entity.BookEntity;

public class BookDTO {
    private String title;
    private String author;

    public BookDTO(BookEntity bookEntity)
    {
        this.title = bookEntity.getTitle();
        this.author = bookEntity.getAuthor();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
