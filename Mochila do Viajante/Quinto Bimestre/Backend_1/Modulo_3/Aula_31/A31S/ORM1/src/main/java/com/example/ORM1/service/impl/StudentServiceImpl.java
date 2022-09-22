package com.example.ORM1.service.impl;

import com.example.ORM1.entity.StudentsEntity;
import com.example.ORM1.repository.IStudentRepository;
import com.example.ORM1.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService<StudentsEntity> {

    private final IStudentRepository studentRepository;

    public StudentServiceImpl(IStudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentsEntity> findAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentsEntity> findStudentById(Long id){
        return  studentRepository.findById(id);
    }
    @Override
    public StudentsEntity addStudent(StudentsEntity studentsEntity){
        if (studentsEntity != null){
            return (StudentsEntity) studentRepository.save(studentsEntity);
        }
        return new StudentsEntity();
    }

    @Override
    public String updateStudent(StudentsEntity studentsEntity){
        if(studentsEntity != null && studentRepository.findById(studentsEntity.getId()).isPresent()){
            studentRepository.saveAndFlush(studentsEntity);
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
