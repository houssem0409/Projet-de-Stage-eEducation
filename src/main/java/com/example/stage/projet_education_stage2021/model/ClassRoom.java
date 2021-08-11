package com.example.stage.projet_education_stage2021.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClassRoom;
    private String RefClassRoom;
    @OneToMany(mappedBy = "classRoom",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Student> students;

    @ManyToMany
    @JoinTable(name = "ClassRoom_Course",
            joinColumns = @JoinColumn(name = "classRoom_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    List<Course> courses;

}
