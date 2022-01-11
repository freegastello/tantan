package com.spring;

import com.spring.config.SpringWebConfig;
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
public class internetYTest {
    @Autowired
    private SessionFactory sessionFactory;

    private Session session;

    @Before
    public void before() {
        session = sessionFactory.openSession();
    }

    @Test
    public void te2() {
        Query query = session.createNativeQuery("SELECT * FROM tantandb.customer");
        List<Customer> customerList = query.getResultList();
        assertEquals(10, customerList.size());
    }

    @After
    public void after() {
        session.close();
        sessionFactory.close();
    }

}
