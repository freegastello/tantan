package com.spring.controller;

import com.spring.config.SpringWebConfig;
import com.spring.entity.Customer;
import com.spring.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class) // Строку оставил для примера. И без неё всё работает
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringWebConfig.class)
public class CustomerControllerTest {
//    private CustomerController controller;
    private CustomerService mockService = mock(CustomerService.class);
    private Model mockModel = mock(Model.class);

    @Autowired
    CustomerController controller;

    @Autowired
    CustomerService customerService;

    @Test
    public void listCustomersTest() {
        Customer customer = getCustomer();
        customerService.saveCustomer(customer);

        when(mockService.getCustomers()).thenReturn(getCustomers());

        String result = controller.listCustomers(mockModel);

        assertEquals("index", result);
    }

    private List<Customer> getCustomers() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(getCustomer());
        return customerList;
    }

    private Customer getCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("firstSave_Test");
        customer.setLastName("lastSave_Test");
        customer.setEmail("email@gmail.com_Test");
        return customer;
    }

    @Test
    public void saveCustomer() {
    }

    @Test
    public void deleteCustomer() {
    }
}