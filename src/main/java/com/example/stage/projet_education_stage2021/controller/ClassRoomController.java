package com.example.stage.projet_education_stage2021.controller;

import com.example.stage.projet_education_stage2021.model.ClassRoom;
import com.example.stage.projet_education_stage2021.model.Student;
import com.example.stage.projet_education_stage2021.service.ClassRoomService;
import com.example.stage.projet_education_stage2021.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("education/")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;

    public ClassRoomController(ClassRoomService classRoomService) {
        this.classRoomService = classRoomService;
    }
    //http://localhost:8080/system/classRooms
    @GetMapping("classRooms")
    public List<ClassRoom> getClassRooms(){
        return classRoomService.getClassRooms();
    }
    //http://localhost:8080/system/classRoom/id
    @GetMapping("classRoom")
    public ClassRoom getClassRoomById(@RequestParam Long id){
        return classRoomService.getClassRoomById(id);
    }
    //http://localhost:8080/system/classRooms
    @PostMapping("classRooms")
    public ClassRoom saveClassRoom(@RequestBody ClassRoom classRoom){
        return classRoomService.saveClassRoom(classRoom);
    }
    //http://localhost:8080/system/classRooms
    @PutMapping("classRooms")
    public ClassRoom editClassRoom(@RequestBody ClassRoom classRoom, @RequestParam  Long id){
        classRoom.setIdClassRoom(id);
        return classRoomService.editClassRoom(classRoom);
    }
    @DeleteMapping ("classRooms")
    public void deleteClassRooms(ClassRoom classRoom, @RequestParam  Long id){
        classRoomService.deleteClassRoom(id);
    }

}
