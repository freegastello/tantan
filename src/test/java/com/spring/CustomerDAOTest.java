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
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringWebConfig.class)
@WebAppConfiguration
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

    @Test
    public void customerHQLTest() {
        /**
         * Тестирование HQL
         */
        List<Customer> customerList = customerDAO.getCustomers();
        assertEquals(0, customerList.size());

        Customer customer = new Customer();
        customer.setFirstName("First_1");
        customer.setLastName("Last_1");
        customer.setEmail("all_1@gmail.com");
        customerDAO.saveCustomer(customer);

        Customer customer2 = new Customer();
        customer2.setFirstName("First_2");
        customer2.setLastName("Last_2");
        customer2.setEmail("all_2@gmail.com");
        customerDAO.saveCustomer(customer2);

//  Работающие варианты:
//        String hql = "FROM Customer";
//        String hql = "SELECT c FROM Customer c";

//        String hql = "SELECT c FROM Customer c WHERE c.firstName = '" + customer2.getFirstName() + "'";
//        String hql = "FROM Customer c WHERE c.firstName = '" + customer2.getFirstName() + "'";
        String hql = "FROM Customer c WHERE c.firstName = '" + customer2.getFirstName() + "' AND c.lastName = '" + customer2.getLastName() + "'";
        Query query = session.createQuery(hql);
        List<Customer> resultList = query.getResultList();

//        assertEquals(2, resultList.size());
        assertEquals(1, resultList.size());

        for (Customer c : resultList) {
            System.out.println(c);
        }
    }

    @After
    public void after() {
//        session.close();
//        sessionFactory.close();
    }

}
