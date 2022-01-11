package com.spring.test;

import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class PropertiesTest {
    public static CustomerService getMyCustomerService() {
        return new CustomerServiceImpl();
    }
}
