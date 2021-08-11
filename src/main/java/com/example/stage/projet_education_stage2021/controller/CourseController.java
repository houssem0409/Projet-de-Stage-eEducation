package com.example.stage.projet_education_stage2021.controller;

import com.example.stage.projet_education_stage2021.model.Course;
import com.example.stage.projet_education_stage2021.model.Student;
import com.example.stage.projet_education_stage2021.service.CourseService;
import com.example.stage.projet_education_stage2021.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("education/")
public class CourseController {
    @Autowired
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    //http://localhost:8080/system/courses
    @GetMapping("courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    //http://localhost:8080/system/courses/id
    @GetMapping("course")
    public Course getCourseById(@RequestParam Long id){
        return courseService.getCourseById(id);
    }
    //http://localhost:8080/system/courses
    @PostMapping("courses")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }
    //http://localhost:8080/system/courses
    @PutMapping("courses")
    public Course editCourse(@RequestBody Course course, @RequestParam  Long id){
        course.setIdCourse(id);
        return courseService.editCourse(course);
    }
    @DeleteMapping ("courses")
    public void deleteCourse(Course course, @RequestParam  Long id){
        courseService.deleteCourse(id);
    }
}
