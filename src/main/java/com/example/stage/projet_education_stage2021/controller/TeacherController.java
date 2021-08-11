package com.example.stage.projet_education_stage2021.controller;

import com.example.stage.projet_education_stage2021.model.Student;
import com.example.stage.projet_education_stage2021.model.Teacher;
import com.example.stage.projet_education_stage2021.service.StudentService;
import com.example.stage.projet_education_stage2021.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("education/")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    //http://localhost:8080/system/teachers
    @GetMapping("teachers")
    public List<Teacher> getTeachers(){
        return teacherService.getTeachers();
    }
    //http://localhost:8080/system/teachers/id
    @GetMapping("teacher")
    public Teacher getTeacherById(@RequestParam Long id){
        return teacherService.getTeacherById(id);
    }
    //http://localhost:8080/system/teachers
    @PostMapping("teachers")
    public Teacher saveTeacher(@RequestBody Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }
    //http://localhost:8080/system/teachers
    @PutMapping("teachers")
    public Teacher editTeachers(@RequestBody Teacher teacher, @RequestParam  Long id){
        teacher.setIdPerson(id);
        return teacherService.editTeacher(teacher);
    }
    @DeleteMapping ("teachers")
    public void deleteTeacher(Teacher teacher, @RequestParam  Long id){
        teacherService.deleteTeacher(id);
    }
}
