package com.aston.snowboard.bootstrap;

import com.aston.snowboard.domain.*;
import com.aston.snowboard.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonagill1 on 6/28/2016.
 */

@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private PersonService personService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private SnowboardService snowboardService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event){
       //generatePeople();
    }

    private void generatePeople(){

        Person person = new Person("Jonathan", "Gille");
        List<Payment> paymentList = new ArrayList<Payment>();
        paymentList.add(new Payment("VISA", 234123412341234L, "12/2017", 123));
        paymentList.add(new Payment("Discover", 2234123412341234L, "11/2016", 323));

        person.setPaymentList(paymentList);


        List<Address> addressList = new ArrayList<Address>();
        addressList.add(new Address("12 AC St.", "St. Paul", "MN", 55113));
        addressList.add(new Address("22 BC St.", "St. Paul", "MN", 55223));
        addressList.add(new Address("32 CC St.", "St. Paul", "MN", 55333));

        person.setAddressList(addressList);

        List<Snowboard> snowboardList = new ArrayList<Snowboard>();
        Snowboard snowboard1 = new Snowboard();
        snowboard1.setBrandName("Burton");
        snowboard1.setBoardName("JuiceWagon");
        snowboard1.setBoardType(BoardType.camber);
        snowboard1.setPhoto("../static/images/juice_wagon.jpg");
        snowboard1.setDescription("I really should not seed this spot in line. This is a bad use of space... This is so lame of me!!");
        Snowboard snowboard2 = new Snowboard();
        snowboard2.setBrandName("GNU");
        snowboard2.setBoardName("Riders Choice");
        snowboard2.setBoardType(BoardType.combo);
        snowboard2.setPhoto("../static/images/wax_gnu.jpg");
        snowboard2.setDescription("I really should not seed this spot in line. This is a bad use of space... This is so lame of me!!");
        Snowboard snowboard3 = new Snowboard();
        snowboard3.setBrandName("Arbor");
        snowboard3.setBoardName("Westmark");
        snowboard3.setBoardType(BoardType.rocker);
        snowboard3.setPhoto("../static/images/westmark.jpg");
        snowboard3.setDescription("I really should not seed this spot in line. This is a bad use of space... This is so lame of me!!");
        Snowboard snowboard4 = new Snowboard();
        snowboard4.setBrandName("Burton");
        snowboard4.setBoardName("Custom");
        snowboard4.setBoardType(BoardType.camber);
        snowboard4.setPhoto("../static/images/custom.jpg");
        snowboard4.setDescription("I really should not seed this spot in line. This is a bad use of space... This is so lame of me!!");

        snowboardList.add(snowboard1);
        snowboardList.add(snowboard2);
        snowboardList.add(snowboard3);
        snowboardList.add(snowboard4);

        snowboardService.saveSnowboardList(snowboardList);
        personService.savePerson(person);
    }
}
