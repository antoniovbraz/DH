package com.example.ORM1.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class StudentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private  String StudentNumber;
    private String name;
    private String Lastname;


    public StudentsEntity(Long id, String studentNumber, String name, String lastname) {
        this.id = id;
        StudentNumber = studentNumber;
        this.name = name;
        Lastname = lastname;
    }

    public StudentsEntity(String studentNumber, String name, String lastname) {
        StudentNumber = studentNumber;
        this.name = name;
        Lastname = lastname;
    }

    public StudentsEntity() {
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
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
