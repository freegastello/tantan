package com.spring;

import com.spring.dao.CustomerDAO;
import com.spring.dao.CustomerDAOImpl;
import com.spring.entity.Customer;
import com.spring.test.PropertiesTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

import java.util.List;

//@TestPropertySource(locations="classpath:test.properties")
@Import(PropertiesTest.class)
public class myTest {
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    CustomerDAO customerDAO;

    @Test
    public void initTest() {
        Customer customer = new Customer();
        customer.setFirstName("First_");
        customer.setLastName("Last_");
        customer.setEmail("all@gmail.com");


        CustomerDAO customerDAO = new CustomerDAOImpl();
        customerDAO.saveCustomer(customer);

//        Session s = ;

//        Session session = sessionFactory.getCurrentSession();
//        customerDAO.saveCustomer(customer);
        List<Customer> list = PropertiesTest.getMyCustomerService().getCustomers();
    }

}
