package com.spring;

import com.spring.config.SpringWebConfig;
import com.spring.dao.CustomerDAO;
import com.spring.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringWebConfig.class)
public class CustomerDAOTest {
    private Session session;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private CustomerDAO customerDAO;

    @Before
    public void before() {
        session = sessionFactory.openSession();
    }

    @Test
    public void customerSaveTest() {
        Customer customer = new Customer();
        customer.setFirstName("First_");
        customer.setLastName("Last_");
        customer.setEmail("all@gmail.com");

        customerDAO.saveCustomer(customer);
        List<Customer> customerList = customerDAO.getCustomers();
        assertEquals(1, customerList.size());
    }

    @After
    public void after() {
        session.close();
        sessionFactory.close();
    }

}
