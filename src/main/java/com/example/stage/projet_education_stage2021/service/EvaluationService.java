package com.example.stage.projet_education_stage2021.service;

import com.example.stage.projet_education_stage2021.dao.EvaluationRepository;
import com.example.stage.projet_education_stage2021.dao.HomeWorkRepository;
import com.example.stage.projet_education_stage2021.model.Evaluation;
import com.example.stage.projet_education_stage2021.model.HomeWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.el.EvaluationListener;
import java.util.List;

@Service
public class EvaluationService {
    private EvaluationRepository evaluationRepository;
    @Autowired
    public EvaluationService(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }
    public List<Evaluation> getEvaluations(){
        return evaluationRepository.findAll();
    }
    public Evaluation getEvaluationById(Long id){
        return evaluationRepository.findById(id).get();
    }
    public Evaluation saveEvaluation(Evaluation evaluation){
        return evaluationRepository.save(evaluation);
    }
    public Evaluation editEvaluation(Evaluation evaluation){
        return evaluationRepository.save(evaluation);
    }
    public void deleteEvaluation( Long id){
        evaluationRepository.deleteById(id);
    }
}
