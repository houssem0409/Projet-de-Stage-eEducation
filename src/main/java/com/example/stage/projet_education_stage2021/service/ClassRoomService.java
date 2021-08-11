package com.example.stage.projet_education_stage2021.service;

import com.example.stage.projet_education_stage2021.dao.ClassRoomRepository;
import com.example.stage.projet_education_stage2021.dao.HomeWorkRepository;
import com.example.stage.projet_education_stage2021.model.ClassRoom;
import com.example.stage.projet_education_stage2021.model.HomeWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {
    private ClassRoomRepository classRoomRepository;
    @Autowired
    public ClassRoomService(ClassRoomRepository classRoomRepository) {
        this.classRoomRepository = classRoomRepository;
    }
    public List<ClassRoom> getClassRooms(){
        return classRoomRepository.findAll();
    }
    public ClassRoom getClassRoomById(Long id){
        return classRoomRepository.findById(id).get();
    }
    public ClassRoom saveClassRoom(ClassRoom classRoom){
        return classRoomRepository.save(classRoom);
    }
    public ClassRoom editClassRoom(ClassRoom classRoom){
        return classRoomRepository.save(classRoom);
    }
    public void deleteClassRoom( Long id){
        classRoomRepository.deleteById(id);
    }
}
