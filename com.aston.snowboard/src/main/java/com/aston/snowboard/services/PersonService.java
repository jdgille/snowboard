package com.aston.snowboard.services;

import com.aston.snowboard.domain.Person;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface PersonService {

    Iterable<Person> listAllPeople();

    Person getPersonById(Integer id);

    Person savePerson(Person person);

    Iterable<Person> savePersonList(Iterable<Person> personIterable);

    void deletePerson(Integer id);

    Person getPersonByName(String name);
}
