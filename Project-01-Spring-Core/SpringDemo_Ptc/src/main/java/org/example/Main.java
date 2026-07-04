package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        Employee employee = (Employee)context.getBean(Employee.class);
        employee.write();
    }
}
