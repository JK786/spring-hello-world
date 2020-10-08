package com.springlearning.springhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class SpringHelloWorldApplication {
    private static ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(SpringHelloWorldApplication.class, args);

        System.out.println(" ----- In SpringHelloWorldApplication main ----");
        System.out.println(" ----- Printing beans : ");
        for(String beanName: applicationContext.getBeanDefinitionNames()) {
            System.out.println("==== " + beanName);
        }
    }

}