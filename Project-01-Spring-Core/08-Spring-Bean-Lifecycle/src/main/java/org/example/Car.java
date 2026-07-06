package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car Bean Created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Car Bean Initialized");
    }

    public void drive() {
        System.out.println("Driver starts the car");
        engine.start();
        System.out.println("Car is now moving");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Car Bean Destroyed");
    }
}