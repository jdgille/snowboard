package com.aston.snowboard.domain;

import javax.persistence.*;
import java.util.List;


/**
 * Created by jonagill1 on 6/27/2016.
 */

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personId")
    private Integer id;

    @Version
    private Integer version;

    private String firstName;
    private String lastName;
    private String userName;
    private String email;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Product> productList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Address> addressList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Payment> paymentList;

    public Person(){}

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
