package org.example;

import org.springframework.stereotype.Component;

@Component
public class Processor {
    public Processor(){
        System.out.println("Processor Bean Created");
    }
   public void process(){
       System.out.println("Processor Processing code");
   }
}
