package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Computer computer=context.getBean(Computer.class);
        Motherboard motherboard=context.getBean(Motherboard.class);
        CPU cpu=context.getBean(CPU.class);
        computer.parts();
        motherboard.contain();
        cpu.process();

    }
}
