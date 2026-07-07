package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;
    public Car() {
        System.out.println("Bean of Car Created");
    }
    @Autowired

    public void setEngine(Engine engine) {
        System.out.println("Setter Injection Executed");
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        System.out.println("Car Started");

    }

}
