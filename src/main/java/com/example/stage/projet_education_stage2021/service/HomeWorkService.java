package com.example.stage.projet_education_stage2021.service;

import com.example.stage.projet_education_stage2021.dao.HomeWorkRepository;
import com.example.stage.projet_education_stage2021.dao.ParentRepository;
import com.example.stage.projet_education_stage2021.model.HomeWork;
import com.example.stage.projet_education_stage2021.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeWorkService {

    private HomeWorkRepository homeWorkRepository;
    @Autowired
    public HomeWorkService(HomeWorkRepository homeWorkRepository) {
        this.homeWorkRepository = homeWorkRepository;
    }
    public List<HomeWork> getHomeWorks(){
        return homeWorkRepository.findAll();
    }
    public HomeWork getHomeWorkById(Long id){
        return homeWorkRepository.findById(id).get();
    }
    public HomeWork saveHomeWork(HomeWork homeWork){
        return homeWorkRepository.save(homeWork);
    }
    public HomeWork editHomeWork(HomeWork homeWork){
        return homeWorkRepository.save(homeWork);
    }
    public void deleteHomeWork( Long id){
        homeWorkRepository.deleteById(id);
    }

}
