package com.spring.config;

import com.spring.entity.Customer;
import com.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitData {

    @Autowired
    private CustomerService customerService;

    public void initData() {
        generateEntityAnimals();
    }

    private void generateEntityAnimals() {
        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer();
            customer.setEmail("email_" + i + "@gmail.com");
            customer.setFirstName("First_" + i);
            customer.setLastName("Last_" + i);
            customerService.saveCustomer(customer);
        }
    }


//    @Autowired
//    AnimalsRepository repo;
//
//    public void initData() {
//        generateEntityAnimals();
//    }
//
//    private void generateEntityAnimals(){
//        List<Animals> animalsList = null;
//        for (int i = 0; i < num_3; i++) {
//            animalsList.add(new Animals("anim_" + i, 20 + i));
//        }
//        repo.saveAll(animalsList);
//    }

}