package com.example.stage.projet_education_stage2021.service;

import com.example.stage.projet_education_stage2021.dao.StudentRepository;
import com.example.stage.projet_education_stage2021.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public Student editStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent( Long id){
        studentRepository.deleteById(id);
    }
}
