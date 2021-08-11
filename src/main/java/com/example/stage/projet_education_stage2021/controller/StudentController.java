package com.example.stage.projet_education_stage2021.controller;

import com.example.stage.projet_education_stage2021.model.Person;
import com.example.stage.projet_education_stage2021.model.Student;
import com.example.stage.projet_education_stage2021.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("education/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //http://localhost:8080/system/students
    @GetMapping("students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    //http://localhost:8080/system/students/id
    @GetMapping("student")
    public Student getStudentById(@RequestParam Long id){
        return studentService.getStudentById(id);
    }
    //http://localhost:8080/system/students
    @PostMapping("students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    //http://localhost:8080/system/students
    @PutMapping("students")
    public Student editStudent(@RequestBody Student student, @RequestParam  Long id){
        student.setIdPerson(id);
        return studentService.editStudent(student);
    }
    @DeleteMapping ("students")
    public void deleteStudent(Student student, @RequestParam  Long id){
        studentService.deleteStudent(id);
    }
}
