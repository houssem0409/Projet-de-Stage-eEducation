package com.example.stage.projet_education_stage2021.service;

import com.example.stage.projet_education_stage2021.dao.PersonRepository;
import com.example.stage.projet_education_stage2021.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public List<Person> getPersons(){
        return personRepository.findAll();
    }
    public Person getPersonById(Long id){
        return personRepository.findById(id).get();
    }
    public Person savePerson(Person person){
        return personRepository.save(person);
    }
    public Person editPerson(Person person){
        return personRepository.save(person);
    }
    public void deletePerson( Long id){
        personRepository.deleteById(id);
    }
}
