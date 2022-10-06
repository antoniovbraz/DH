package com.example.ORM1.repository;

import com.example.ORM1.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {

}
