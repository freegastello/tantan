package com.spring.controller;

import com.spring.entity.Customer;
import com.spring.service.CustomerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {
    private CustomerController controller;

    @Before
    public void setUp() {
        CustomerService service = mock(CustomerService.class);
        controller = new CustomerController(service);
    }

    @Test
    public void firstTest() {
        controller.saveCustomer(getCustomer());

        Model model = createModel();
        model.addAttribute("customers", getCustomers());
        String result = controller.listCustomers(model);
        assertEquals("index", result);
    }

    private Customer getCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("firstSave_Test");
        customer.setLastName("lastSave_Test");
        customer.setEmail("email@gmail.com_Test");
        return customer;
    }

    private List<Customer> getCustomers() {
        Customer customer = new Customer();
        customer.setFirstName("firstSave_Test");
        customer.setLastName("lastSave_Test");
        customer.setEmail("email@gmail.com_Test");
        return new ArrayList<>(Arrays.asList(customer));
    }

    private Model createModel() {
        return new Model() {
            @Override
            public Model addAttribute(String attributeName, Object attributeValue) {
                return null;
            }

            @Override
            public Model addAttribute(Object attributeValue) {
                return null;
            }

            @Override
            public Model addAllAttributes(Collection<?> attributeValues) {
                return null;
            }

            @Override
            public Model addAllAttributes(Map<String, ?> attributes) {
                return null;
            }

            @Override
            public Model mergeAttributes(Map<String, ?> attributes) {
                return null;
            }

            @Override
            public boolean containsAttribute(String attributeName) {
                return false;
            }

            @Override
            public Object getAttribute(String attributeName) {
                return null;
            }

            @Override
            public Map<String, Object> asMap() {
                return null;
            }
        };
    }
}
