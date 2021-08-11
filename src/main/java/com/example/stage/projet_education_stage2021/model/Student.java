package com.example.stage.projet_education_stage2021.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("Std")
public class Student extends Person{

    private String Matricul;
    @ManyToOne
    ClassRoom classRoom;
    @ManyToOne
    Parent parent;
}
