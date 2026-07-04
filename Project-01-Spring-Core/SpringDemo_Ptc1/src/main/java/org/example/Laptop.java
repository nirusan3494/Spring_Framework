package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private final Processor processor;
    public Laptop(Processor processor){
        this.processor = processor;
        System.out.println("Laptop Bean Created");
    }

    void code(){
        System.out.println("Laptop is used for coding");
        processor.process();
    }
}
