package org.example;

import org.springframework.stereotype.Component;

@Component ("officeComputer")
public class HpComputer implements Computer {
    public HpComputer(){
        System.out.println("HpLaptop class Bean Created");
    }
    @Override
    public void start(){
        System.out.println("HpLaptop bean Started");
    }
    @Override
    public void stop(){
        System.out.println("HpLaptop bean Stopped");
    }

}
