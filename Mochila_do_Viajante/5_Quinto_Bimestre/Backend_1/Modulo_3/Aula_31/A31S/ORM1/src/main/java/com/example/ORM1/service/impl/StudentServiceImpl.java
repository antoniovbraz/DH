package com.example.ORM1.service.impl;

import com.example.ORM1.entity.StudentEntity;
import com.example.ORM1.repository.IStudentRepository;
import com.example.ORM1.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService<StudentEntity> {

    private final IStudentRepository studentRepository;

    public StudentServiceImpl(IStudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentEntity> findAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> findStudentById(Long id){
        return  studentRepository.findById(id);
    }

    @Override
    public StudentEntity addStudent(StudentEntity studentEntity){
        if (studentEntity != null){
            return (StudentEntity) studentRepository.save(studentEntity);
        }
        return new StudentEntity();
    }

    @Override
    public String updateStudent(StudentEntity studentEntity){
        if(studentEntity != null && studentRepository.findById(studentEntity.getId()).isPresent()){
            studentRepository.saveAndFlush(studentEntity);
            return "Student Updated";
        }
        return "Student not found";
    }

    @Override
    public String deleteStudent(Long id){
        if (studentRepository.findById(id).isPresent()){
            studentRepository.deleteById(id);
            return "Student Deleted";
        }
        return "Student not found";
    }
}
