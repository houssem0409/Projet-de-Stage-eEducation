package com.example.stage.projet_education_stage2021.controller;

import com.example.stage.projet_education_stage2021.model.HomeWork;
import com.example.stage.projet_education_stage2021.model.Student;
import com.example.stage.projet_education_stage2021.service.HomeWorkService;
import com.example.stage.projet_education_stage2021.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("education/")
public class HomeWorkController {
    @Autowired
    private HomeWorkService homeWorkService;

    public HomeWorkController(HomeWorkService homeWorkService) {
        this.homeWorkService = homeWorkService;
    }
    //http://localhost:8080/system/homeworks
    @GetMapping("homeWorks")
    public List<HomeWork> getHomeWorks(){
        return homeWorkService.getHomeWorks();
    }
    //http://localhost:8080/system/students/id
    @GetMapping("homeWork")
    public HomeWork getHomeWorkById(@RequestParam Long id){
        return homeWorkService.getHomeWorkById(id);
    }
    //http://localhost:8080/system/students
    @PostMapping("homeWorks")
    public HomeWork saveHomeWork(@RequestBody HomeWork homeWork){
        return homeWorkService.saveHomeWork(homeWork);
    }
    //http://localhost:8080/system/students
    @PutMapping("homeWorks")
    public HomeWork editHomeWork(@RequestBody HomeWork homeWork, @RequestParam  Long id){
        homeWork.setIdHomeWork(id);
        return homeWorkService.editHomeWork(homeWork);
    }
    @DeleteMapping ("homeWorks")
    public void deleteStudent(Student student, @RequestParam  Long id){
        homeWorkService.deleteHomeWork(id);
    }
}
