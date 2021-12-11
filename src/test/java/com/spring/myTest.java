package com.spring;

import com.spring.dao.CustomerDAO;
import com.spring.entity.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class myTest {
    @Autowired
    CustomerDAO repo;

    @Test
    public void initTest() {
        Customer customer = new Customer();
        customer.setFirstName("First_");
        customer.setLastName("Last_");
        customer.setEmail("all@gmail.com");
        repo.saveCustomer(customer);
    }

}
