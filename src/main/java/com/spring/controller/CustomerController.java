package com.spring.controller;

import com.spring.entity.Customer;
import com.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public String listCustomers(Model model) {
        List<Customer> customerList = customerService.getCustomers();

        Customer customer = new Customer();
        customer.setFirstName("firstSave");
        customer.setLastName("lastSave");
        customer.setEmail("email@gmail.com");
        customerService.saveCustomer(customer);

        model.addAttribute("customers", customerList);
        return "index";
    }

//    @GetMapping("/objtest")
//    public List<Customer> listCustomers(GsonRequestDTO dto) {
//        System.out.println("dto = " + dto);
//        List<Customer> customerList = customerService.getCustomers();
//        return customerList;
//    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(
            @RequestParam("customerId") int theId,
            Model theModel
    ) {
        Customer theCustomer = customerService.getCustomer(theId);
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId) {
        customerService.deleteCustomer(theId);
        return "redirect:/customer/list";
    }
}


//        Customer customer = new Customer();
//        customer.setFirstName("firstSave");
//        customer.setLastName("lastSave");
//        customer.setEmail("email@gmail.com");
//        customerService.saveCustomer(customer);

