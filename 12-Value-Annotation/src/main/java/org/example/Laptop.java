package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Value("Lenovo")
    private String brand;

    @Value("Intel Core i7")
    private String processor;

    @Value("16")
    private int ram;

    @Value("512")
    private int storage;

    @Value("15000.45")
    private double price;

    @Value("false")
    private boolean dedicatedGraphics;

    public Laptop() {
        System.out.println("Laptop Bean Created");
    }

    public void laptopDetails() {
        System.out.println("Laptop Configuration");
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: ₹" + price);
        System.out.println("Dedicated Graphics: " + dedicatedGraphics);
    }
}