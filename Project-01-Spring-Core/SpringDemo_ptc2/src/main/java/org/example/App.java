package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String [] args) {
       ApplicationContext context=new AnnotationConfigApplicationContext("org.example");
       Bank bank=context.getBean(Bank.class);
       bank.login();
    }
}
