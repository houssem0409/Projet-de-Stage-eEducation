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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;
    private String Name;
    @OneToMany(mappedBy = "course",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Teacher> teachers;
    @OneToMany(mappedBy = "course",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<HomeWork> homeWork;
    @ManyToMany()
    List<ClassRoom> classRooms;

}
