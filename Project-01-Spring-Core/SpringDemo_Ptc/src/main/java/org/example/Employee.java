package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Employee {


    public Employee(Pen pen){
        System.out.println("Employee Bean Created");
    }
 public void write(){
     System.out.println("EmployeeWriting with pen");
 }
}
