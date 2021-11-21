package com.spring;

import com.spring.config.InitData;
import com.spring.config.SpringConfig;
import com.spring.config.WebAppConfig;
import com.spring.entity.Animals;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {
    private static final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebAppConfig.class);
//    private static final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    public static void main(String[] args) {
//        Logger logger = LoggerFactory.getLogger(Main.class);
//        logger.info("Hello World");
//        logger.debug("Hello World debug");
//        logger.getName();
//        logger.warn("hello warn");
//        logger.trace("hello trace");

//        context.getBean("initData");

        InitData init = new InitData();
        init.initData();

//        Animals animals = new Animals("Киса", 5);
    }

    @Bean(initMethod = "initData")
    public InitData initialData() {
        return new InitData();
    }

}
