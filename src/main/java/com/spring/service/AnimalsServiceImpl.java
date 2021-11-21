package com.spring.service;

import com.spring.dao.AnimalsRepository;
import com.spring.entity.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalsServiceImpl implements AnimalsService{
    @Autowired
    AnimalsRepository repo;

    @Override
    public List<Animals> myLoad() {
        return repo.findAll();
    }
}
