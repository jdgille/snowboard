package com.aston.snowboard.domain.VO;

import com.aston.snowboard.domain.Address;
import com.aston.snowboard.domain.Person;

/**
 * Created by jonagill1 on 7/5/2016.
 */
public class UserVO {

    private Person person;
    private Address address;
    private String password;

    public UserVO(){}

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
