package com.spring.config;

import com.spring.dao.AnimalsRepository;
import com.spring.entity.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.spring.utils.MagicNumber.num_3;

@Component
public class InitData {
    @Autowired
    AnimalsRepository repo;

    public void initData() {
        generateEntityAnimals();
    }

    private void generateEntityAnimals(){
        List<Animals> animalsList = null;
        for (int i = 0; i < num_3; i++) {
            animalsList.add(new Animals("anim_" + i, 20 + i));
        }
        repo.saveAll(animalsList);
    }

}
