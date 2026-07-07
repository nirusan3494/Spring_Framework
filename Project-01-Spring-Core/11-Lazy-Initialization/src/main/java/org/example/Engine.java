package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Engine {
    public Engine(){
        System.out.println("Engine Bean Created");
    }
    public void start(){
        System.out.println("Engine Started");
    }
}
