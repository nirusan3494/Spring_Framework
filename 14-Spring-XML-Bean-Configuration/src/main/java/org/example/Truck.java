package org.example;

public class Truck {

    private Engine engine;
    public Truck() {
        System.out.println("Car Bean Created");
    }

    public void setEngine(Engine engine) {
        System.out.println("Setter Injection Executed");
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car Started");
    }
}