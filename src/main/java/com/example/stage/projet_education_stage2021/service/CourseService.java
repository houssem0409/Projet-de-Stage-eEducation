package com.example.stage.projet_education_stage2021.service;


import com.example.stage.projet_education_stage2021.dao.CourseRepository;
import com.example.stage.projet_education_stage2021.dao.HomeWorkRepository;
import com.example.stage.projet_education_stage2021.model.Course;
import com.example.stage.projet_education_stage2021.model.HomeWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseRepository courseRepository;
    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }
    public Course getCourseById(Long id){
        return courseRepository.findById(id).get();
    }
    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }
    public Course editCourse(Course course){
        return courseRepository.save(course);
    }

    public void deleteCourse( Long id){
        courseRepository.deleteById(id);
    }
}
