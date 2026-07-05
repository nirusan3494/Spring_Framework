package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Developer {
    private Computer computer;
    public Developer(@Qualifier("officeComputer") Computer computer) {
        this.computer = computer;
        System.out.println("Second Constructor bean");
    }
    public void code(){
        System.out.println("Developer is coding");
        computer.start();
        computer.stop();
    }





}
