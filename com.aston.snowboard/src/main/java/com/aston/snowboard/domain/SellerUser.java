package com.aston.snowboard.domain;

/**
 * Created by jonagill1 on 7/5/2016.
 */
public class SellerUser {

    private Person person;
    private Address address;
    private String password;
    private String username;

    public SellerUser(){
        this.person = new Person();
        this.address = new Address();
    }

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
