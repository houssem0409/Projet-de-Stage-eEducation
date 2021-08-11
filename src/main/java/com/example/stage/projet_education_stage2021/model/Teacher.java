package com.example.stage.projet_education_stage2021.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("Tch")
public class Teacher extends Person{

    private String Speciality;
    @OneToMany(mappedBy = "teacher",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Evaluation> evaluations;
    @ManyToOne
    Course course;
}
