package com.spring.controller;

import com.spring.entity.Customer;
import com.spring.service.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Map;

public class CustomerController_2_Test {
    CustomerController controller;

    @Autowired
    CustomerService customerService;

    @Before
    public void setUp() {
        controller = new CustomerController();
    }

    @Test
    public void firstTest() {
        controller.saveCustomer(getCustomer());

        //controller.listCustomers();
    }


    private void getModel() {

    }


    private Customer getCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("firstSave_Test");
        customer.setLastName("lastSave_Test");
        customer.setEmail("email@gmail.com_Test");
        return customer;
    }

}
