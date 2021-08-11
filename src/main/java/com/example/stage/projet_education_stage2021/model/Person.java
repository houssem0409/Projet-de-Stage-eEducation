package com.example.stage.projet_education_stage2021.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="person_type")
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idPerson;
    protected String Name;
    protected String LastName;
    protected int age;
    protected String Email;
    protected String Password;
    protected String City;
    protected String Street;
    protected int PostalCode;
    @OneToMany(mappedBy = "person",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Comment> comments;

}
