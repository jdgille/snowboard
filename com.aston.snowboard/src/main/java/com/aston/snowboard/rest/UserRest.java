package com.aston.snowboard.rest;

import com.aston.snowboard.domain.Person;
import com.aston.snowboard.domain.Product;
import com.aston.snowboard.repositories.PersonRepository;
import com.aston.snowboard.services.PersonService;
import com.aston.snowboard.services.SnowboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jonagill1 on 7/12/2016.
 */

@RestController
@RequestMapping("/users")
public class UserRest {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/list")
    public Iterable<Person> listAllProjects() {
        return personRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Person listAllProducts(@PathVariable Integer id) {
        return personRepository.findOne(id);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Person savePerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return savedPerson;
    }

}