package com.example.stage.projet_education_stage2021.service;

import com.example.stage.projet_education_stage2021.dao.TeacherRepository;
import com.example.stage.projet_education_stage2021.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService {
    private TeacherRepository teacherRepository;
    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }
    public Teacher getTeacherById(Long id){
        return teacherRepository.findById(id).get();
    }
    public Teacher saveTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
    public Teacher editTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
    public void deleteTeacher( Long id){
        teacherRepository.deleteById(id);
    }
}
