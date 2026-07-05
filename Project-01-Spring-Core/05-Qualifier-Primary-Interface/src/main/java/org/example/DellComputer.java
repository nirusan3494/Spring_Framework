package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DellComputer implements Computer {
    public DellComputer(){
        System.out.println("DellComputer class Bean Created");
    }
    @Override
    public void start() {
        System.out.println("DellComputer Bean Started");
    }
    @Override
    public void stop() {
        System.out.println("DellComputer Bean Stopped");
    }

}
