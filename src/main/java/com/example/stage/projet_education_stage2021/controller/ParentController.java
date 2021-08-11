package com.example.stage.projet_education_stage2021.controller;

import com.example.stage.projet_education_stage2021.model.Parent;
import com.example.stage.projet_education_stage2021.model.Student;
import com.example.stage.projet_education_stage2021.service.ParentService;
import com.example.stage.projet_education_stage2021.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("education/")
public class ParentController {
    @Autowired
    private ParentService parentService;

    public ParentController(ParentService parentService) {
        this.parentService = parentService;
    }

    //http://localhost:8080/system/parents
    @GetMapping("parents")
    public List<Parent> getParents(){
        return parentService.getParents();
    }

    //http://localhost:8080/system/parents/id
    @GetMapping("parent")
    public Parent getParentById(@RequestParam Long id){
        return parentService.getParentById(id);
    }
    //http://localhost:8080/system/parents
    @PostMapping("parents")
    public Parent saveParent(@RequestBody Parent parent){
        return parentService.saveParent(parent);
    }
    //http://localhost:8080/system/parents
    @PutMapping("parents")
    public Parent editParent(@RequestBody Parent parent, @RequestParam  Long id){
        parent.setIdPerson(id);
        return parentService.editParent(parent);
    }
    @DeleteMapping ("parents")
    public void deleteParent(Student student, @RequestParam  Long id){
        parentService.deleteParent(id);
    }
}
