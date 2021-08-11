package com.example.stage.projet_education_stage2021.service;

import com.example.stage.projet_education_stage2021.dao.ParentRepository;
import com.example.stage.projet_education_stage2021.model.Parent;
import com.example.stage.projet_education_stage2021.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {
    private ParentRepository parentRepository;
    @Autowired
    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }
    public List<Parent> getParents(){
        return parentRepository.findAll();
    }
    public Parent getParentById(Long id){
        return parentRepository.findById(id).get();
    }
    public Parent saveParent(Parent parent){
        return parentRepository.save(parent);
    }
    public Parent editParent(Parent parent){
        return parentRepository.save(parent);
    }
    public void deleteParent( Long id){
        parentRepository.deleteById(id);
    }
}
