package com.spring;

import com.spring.entity.Customer;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class Main {
    public static void main(String[] args) {
        LocalSessionFactoryBean sessionFactory = null;
        
        Customer customer = new Customer();
        customer.setFirstName("111");
        customer.setLastName("");
        
        sessionFactory.getObject().getCurrentSession().persist(customer);
    }
}
