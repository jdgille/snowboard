package com.aston.snowboard.controllers;

import com.aston.snowboard.domain.*;
import com.aston.snowboard.domain.VO.ProductVO;
import com.aston.snowboard.domain.VO.UserVO;
import com.aston.snowboard.repositories.PersonRepository;
import com.aston.snowboard.services.AddressService;
import com.aston.snowboard.services.PersonService;
import com.aston.snowboard.services.ProductService;
import com.aston.snowboard.services.SnowboardService;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Controller
public class UserController {

    @Autowired
    private ProductService productService;

    @Autowired
    private SnowboardService snowboardService;

    @Autowired
    private PersonService personService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/snowboards", method = RequestMethod.GET)
    public String snowboardsHome(){
        return "snowboards/snowboards";
    }

    @RequestMapping(value = "/snowboards/rocker", method = RequestMethod.GET)
    public String rockerList(Model model){
        model.addAttribute("snowboardList", snowboardService.listAllRockerBoards());
        return "snowboards/rocker";
    }

    @RequestMapping(value = "/snowboards/camber", method = RequestMethod.GET)
    public String camberList(Model model){
        model.addAttribute("snowboardList", snowboardService.listAllCamberBoards());
        return "snowboards/camber";
    }

    @RequestMapping(value = "/snowboards/combo", method = RequestMethod.GET)
    public String comboList(Model model){
        model.addAttribute("snowboardList", snowboardService.listAllComboBoards());
        return "snowboards/combo";
    }

    @RequestMapping(value = "/account_home", method = RequestMethod.GET)
    public String accountHome(){
        return "users/account_home";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(){
        return "contact";
    }

//region product
    @RequestMapping(value = "/users/add_product", method = RequestMethod.GET)
    public String addProduct(Model model){
        model.addAttribute("productVO", new ProductVO());
        return "users/add_product";
    }

    @RequestMapping(value = "/users/product_list", method = RequestMethod.POST)
    public String addProduct(ProductVO productVO, Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        Person person = personService.getPersonByName(name);
        List<Product> productList = new ArrayList<Product>();
        Snowboard snowboard = new Snowboard();

        snowboard.setBrandName(productVO.getSnowboard().getBrandName());
        snowboard.setBoardName(productVO.getSnowboard().getBoardName());
        snowboard.setLength(productVO.getSnowboard().getLength());
        snowboard.setCost(productVO.getSnowboard().getCost());
        snowboard.setDescription(productVO.getSnowboard().getDescription());
        snowboard.setBoardType(productVO.getSnowboard().getBoardType());



        if(person.getProductList() != null){
            productList = person.getProductList();
        }

        snowboardService.saveSnowboard(snowboard);
        productList.add(snowboard);
        person.setProductList(productList);
        personService.savePerson(person);


        return "redirect:/users/product_list";
    }


    @RequestMapping(value = "/users/product_list", method = RequestMethod.GET)
    public String productList(Model model){
        Person person = getLoggedInUser();

        model.addAttribute("snowboardList", person.getProductList());

        return "users/product_list";
    }

    @RequestMapping(value = "/users/edit_product/{id}", method = RequestMethod.GET)
    public String editProduct(@PathVariable int id, Model model){
        Snowboard snowboard = snowboardService.getSnowboardById(id);

        model.addAttribute("snowboard", snowboard);

        return "users/edit_product";
    }

    @RequestMapping(value = "/users/update_product", method = RequestMethod.POST)
    public String updateProduct(Snowboard snowboard, Model model){

        snowboardService.saveSnowboard(snowboard);

        return "redirect:/users/edit_product/" + snowboard.getId();
    }

    @RequestMapping(value = "/users/delete_product/{id}", method = RequestMethod.GET)
    public String productDelete(@PathVariable int id){
        //retireve list of products from person
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        Person person = personService.getPersonByName(name);
        List<Product> productList = person.getProductList();
        //remove product with {id} from list
        //for loop serching for product with id of then remove
        Product pToRemove = null;
        for (Product p : productList) {
            if (p.getId() == id) {
                pToRemove = p;
                break;
            }

        }
        if (pToRemove != null)
            productList.remove(pToRemove);

        //save person with updated list
        personService.savePerson(person);

        snowboardService.deleteSnowboard(id);

        return "redirect:/users/product_list";
    }

//endregion

//region edit user
    @RequestMapping(value = "/users/edit_user", method = RequestMethod.GET)
         public String editAccount(Model model){
        //just started working on this.
        UserVO userVO = new UserVO();
        Person person = getLoggedInUser();
        userVO.setPerson(person);

        model.addAttribute("userVO", userVO);
        model.addAttribute("addressList", person.getAddressList());

        return "users/edit_user";
    }
//endregion

//region add user
    @RequestMapping(value = "/add_user", method = RequestMethod.GET)
    public String addUser(Model model){
        model.addAttribute("userVO", new UserVO());
        return "add_user";
    }

    @RequestMapping(value = "/add_user", method = RequestMethod.POST)
    public String addUser(UserVO userVO, Model model){
        JdbcUserDetailsManager userDetailsService = new JdbcUserDetailsManager();
        userDetailsService.setDataSource(dataSource);
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        hydrateUser(userVO);

        if(!userDetailsService.userExists(userVO.getPerson().getUserName())){
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            authorities.add(new SimpleGrantedAuthority("USER"));
            User userDetails = new User(userVO.getPerson().getUserName(), encoder.encode(userVO.getPassword()), authorities);

            userDetailsService.createUser(userDetails);
        }

        return "/index";
    }

    //endregion

    private void hydrateUser(UserVO userVO){
        Person person = new Person();
        Address address = new Address();

        person.setUserName(userVO.getPerson().getUserName());
        person.setFirstName(userVO.getPerson().getFirstName());
        person.setLastName(userVO.getPerson().getLastName());
        person.setEmail(userVO.getPerson().getEmail());
        address.setStreet(userVO.getAddress().getStreet());
        address.setCity(userVO.getAddress().getCity());
        address.setState(userVO.getAddress().getState());
        address.setZipCode(userVO.getAddress().getZipCode());
        address.setCountry(userVO.getAddress().getCountry());
        address.setAddressType(userVO.getAddress().getAddressType());

        personService.savePerson(person);
        addressService.saveAddress(address);
    }

    public Person getLoggedInUser(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        String name = auth.getName();

        Person person = personService.getPersonByName(name);

        return person;
    }

}
