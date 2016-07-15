package com.aston.snowboard.repositories;

import com.aston.snowboard.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findByUserName(String name);
}
