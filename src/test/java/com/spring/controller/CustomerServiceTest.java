package com.spring.controller;

import com.spring.config.SpringWebConfig;
import com.spring.entity.Customer;
import com.spring.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringWebConfig.class)
@WebAppConfiguration
public class CustomerServiceTest {
    @Autowired
    private CustomerService service;

    @Test
    public void listCustomersTest() {
        service.saveCustomer(getCustomer());

        List<Customer> listCustomers = service.getCustomers();

        assertEquals(1, listCustomers.size());
    }

    private Customer getCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("firstSave_Test");
        customer.setLastName("lastSave_Test");
        customer.setEmail("email@gmail.com_Test");
        return customer;
    }
}
