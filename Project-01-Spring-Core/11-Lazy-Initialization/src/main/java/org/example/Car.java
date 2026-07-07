package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Car {
    private final Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car Bean Created");
    }

    public void drive (){
        engine.start();
        System.out.println("Car Started");
    }
}
