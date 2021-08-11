package com.example.stage.projet_education_stage2021.dao;

import com.example.stage.projet_education_stage2021.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
