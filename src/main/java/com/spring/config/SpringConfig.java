package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource(value = "aplication.properties", ignoreResourceNotFound = true)
@ComponentScan("com.spring")
public class SpringConfig {

}
