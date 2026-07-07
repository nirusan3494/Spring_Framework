package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

        @Value("${laptop.processor}")
        private String processor;

        @Value("${laptop.ram}")
        private int ram;

        @Value("${laptop.storage}")
        private int storage;

        @Value("${laptop.price}")
        private double price;

        @Value("${laptop.dedicatedGraphics}")
        private boolean dedicatedGraphics;
    public Laptop() {
        System.out.println("Laptop Bean created");
    }
    public void laptopDetails() {
        System.out.println("Laptop created");
        System.out.println("Processor: " + processor);
        System.out.println("Ram: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println("DedicatedGraphics: " + dedicatedGraphics);
    }
    }

