package com.example.stage.projet_education_stage2021.controller;

import com.example.stage.projet_education_stage2021.model.Evaluation;
import com.example.stage.projet_education_stage2021.model.Student;
import com.example.stage.projet_education_stage2021.service.EvaluationService;
import com.example.stage.projet_education_stage2021.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("education/")
public class EvaluationController {
    @Autowired
    private EvaluationService evaluationService;

    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }
    //http://localhost:8080/system/evaluations
    @GetMapping("evaluations")
    public List<Evaluation> getEvaluations(){
        return evaluationService.getEvaluations();
    }
    //http://localhost:8080/system/evaluations/id
    @GetMapping("evaluation")
    public Evaluation getEvaluationById(@RequestParam Long id){
        return evaluationService.getEvaluationById(id);
    }
    //http://localhost:8080/system/evaluations
    @PostMapping("evaluations")
    public Evaluation saveEvaluation(@RequestBody Evaluation evaluation){
        return evaluationService.saveEvaluation(evaluation);
    }
    //http://localhost:8080/system/evaluations
    @PutMapping("evaluations")
    public Evaluation editEvaluation(@RequestBody Evaluation evaluation, @RequestParam  Long id){
        evaluation.setIdEvaluation(id);
        return evaluationService.editEvaluation(evaluation);
    }
    @DeleteMapping ("evaluations")
    public void deleteStudent(Evaluation evaluation, @RequestParam  Long id){
        evaluationService.deleteEvaluation(id);
    }
}
