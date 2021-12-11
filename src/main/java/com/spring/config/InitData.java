package com.spring.config;

import com.spring.dao.CustomerDAO;
import com.spring.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.spring.utils.MagicNumber.num_3;

@Component
public class InitData {

    @Autowired
    CustomerDAO repo;

    public void initData() {
        generateEntityAnimals();
    }

    private void generateEntityAnimals(){
//        for (int i = 0; i < num_3; i++) {
//            Customer customer = new Customer();
//            customer.setFirstName("First_" + i);
//            customer.setLastName("Last_" + i);
//            customer.setEmail("all@gmail.com");
//            repo.saveCustomer(customer);
//        }

//        Customer customer = new Customer();
//        customer.setFirstName("111");
//        customer.setLastName("222");
//        repo.saveCustomer(customer);


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