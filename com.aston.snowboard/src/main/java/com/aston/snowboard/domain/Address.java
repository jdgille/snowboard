package com.aston.snowboard.domain;

import javax.persistence.*;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressId")
    private Integer id;

    @Version
    private Integer version;

    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String country;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    public Address(){}

    public Address(String street, String city, String state, int zipCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
