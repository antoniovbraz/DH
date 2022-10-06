package com.example.ORM1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private  String StudentNumber;
    private String name;
    private String lastname;


    public StudentEntity(Long id, String studentNumber, String name, String lastname) {
        this.id = id;
        StudentNumber = studentNumber;
        this.name = name;
        this.lastname = lastname;
    }

    public StudentEntity(String studentNumber, String name, String lastname) {
        StudentNumber = studentNumber;
        this.name = name;
        this.lastname = lastname;
    }

    public StudentEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
