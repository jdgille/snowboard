package com.aston.snowboard.services.impl;

import com.aston.snowboard.domain.Person;
import com.aston.snowboard.repositories.PersonRepository;
import com.aston.snowboard.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Iterable<Person> listAllPeople() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Integer id) {
        return personRepository.findOne(id);
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Iterable<Person> savePersonList(Iterable<Person> personIterable) {
        return personRepository.save(personIterable);
    }

    @Override
    public void deletePerson(Integer id) {
        personRepository.delete(id);
    }

    @Override
    public Person getPersonByName(String name) {
        return personRepository.findByUserName(name);
    }
}
