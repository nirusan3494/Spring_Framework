package org.example;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine() {
        System.out.println("Bean of Engine Created");
    }
    public void start(){
        System.out.println("Engine Started");
    }
}
