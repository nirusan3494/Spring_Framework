package org.example;

import org.springframework.stereotype.Component;

@Component
public class Pen {

    public Pen(){
        System.out.println("Pen Bean Created");


    }

    public void write(){
        System.out.println("pen used for writing");
    }
}
