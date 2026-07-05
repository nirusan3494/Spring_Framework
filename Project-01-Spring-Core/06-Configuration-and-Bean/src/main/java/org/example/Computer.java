package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Computer {
    public Computer(Motherboard motherboard){

    }
    public void parts(){
        System.out.println("Motherboard is Part of Computer");
    }
}
