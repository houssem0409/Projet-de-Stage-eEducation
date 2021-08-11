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
@DiscriminatorValue("Prt")
public class Parent extends Person{
    private int numCin;
    @OneToMany(mappedBy = "parent",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Student> students;
    @OneToMany(mappedBy = "parent",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Evaluation> evaluations;

}
