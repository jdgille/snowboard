package com.aston.snowboard.domain;

import javax.persistence.*;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paymentId")
    private Integer id;

    @Version
    private Integer version;

    private String  cardType;
    private double  cardNumber;
    private String  expDate;
    private int     CVC;

    public Payment(){}

    public Payment(String cardType, double cardNumber, String expDate, int CVC){
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.CVC = CVC;
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

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(double cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }
}
