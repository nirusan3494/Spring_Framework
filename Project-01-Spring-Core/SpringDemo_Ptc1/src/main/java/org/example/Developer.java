package org.example;

import org.springframework.stereotype.Component;

@Component
public class Developer {
    private final Laptop laptop;
    public Developer(Laptop laptop){
        this.laptop = laptop;
        System.out.println("Developer Bean Created");
    }
    public void develop(){
        System.out.println("Developer is developing");
        laptop.code();
    }
}
