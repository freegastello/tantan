package com.spring;

import com.spring.config.SpringWebConfig;
import com.spring.entity.Customer;
import com.spring.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringWebConfig.class)
public class CustomerServiceTest {
    @Autowired
    CustomerService customerService;

    @Test
    public void initTest() {
        Customer customer = new Customer();
        customer.setFirstName("First_");
        customer.setLastName("Last_");
        customer.setEmail("all@gmail.com");

        customerService.saveCustomer(customer);
        List<Customer> customerList = customerService.getCustomers();
        assertEquals(1, customerList.size());
    }

}
