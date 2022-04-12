package com.spring.controller;

import com.spring.dto.GsonRequestDTO;
import com.spring.entity.Customer;
import com.spring.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@RequestMapping
@RestController
public class TempController {
    private static final Logger log = LoggerFactory.getLogger(TempController.class);

    @Autowired
    private CustomerService customerService;

//    @GetMapping("/")
//    public String listCustomers(Model model) {
//        List<Customer> customerList = customerService.getCustomers();
//
//        Customer customer = new Customer();
//        customer.setFirstName("firstSave");
//        customer.setLastName("lastSave");
//        customer.setEmail("email@gmail.com");
//        customerService.saveCustomer(customer);
//
//        model.addAttribute("customers", customerList);
//        return "index";
//    }

//    // 1 GET
//    @GetMapping("/objtest")
//    public String listCustomers(
//            String id_product,
//            String qty_product
//    ) {
//        System.out.println("dto = " + id_product + " = " + qty_product);
//        List<Customer> customerList = customerService.getCustomers();
//        return "index";
//    }

    // 2 POST
    @PostMapping("/objtest")
    public String listCustomers(GsonRequestDTO dto) {
        log.info("Сработал контроллер");
        System.out.println("Пришло = " + dto);//dtodtodto = GsonRequestDTO{id_product='abc', qty_product='def'}
        return "index";
    }



//    @GetMapping("/showForm")
//    public String showFormForAdd(Model theModel) {
//        Customer theCustomer = new Customer();
//        theModel.addAttribute("customer", theCustomer);
//        return "customer-form";
//    }
//
//    @PostMapping("/saveCustomer")
//    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
//        customerService.saveCustomer(theCustomer);
//        return "redirect:/customer/list";
//    }
//
//    @GetMapping("/updateForm")
//    public String showFormForUpdate(
//            @RequestParam("customerId") int theId,
//            Model theModel
//    ) {
//        Customer theCustomer = customerService.getCustomer(theId);
//        theModel.addAttribute("customer", theCustomer);
//        return "customer-form";
//    }
//
//    @GetMapping("/delete")
//    public String deleteCustomer(@RequestParam("customerId") int theId) {
//        customerService.deleteCustomer(theId);
//        return "redirect:/customer/list";
//    }
}


//        Customer customer = new Customer();
//        customer.setFirstName("firstSave");
//        customer.setLastName("lastSave");
//        customer.setEmail("email@gmail.com");
//        customerService.saveCustomer(customer);

