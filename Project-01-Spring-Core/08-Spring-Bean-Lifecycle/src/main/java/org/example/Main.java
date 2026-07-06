package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
     public static void main(String[] args) {
         AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(AppConfig.class);
       Car car = (Car) context.getBean("car");
       car.drive();
       context.close();
    }
}
