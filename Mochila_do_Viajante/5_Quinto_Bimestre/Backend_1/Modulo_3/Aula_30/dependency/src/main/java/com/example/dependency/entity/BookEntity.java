package com.example.dependency.entity;

public class BookEntity {

    private Integer id;
    private String title;
    private  String author;

    public BookEntity(Integer id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public BookEntity(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
