package org.example;

import org.springframework.stereotype.Component;

@Component
public class TransactionService {

    public TransactionService() {

        System.out.println("TransactionService Bean created");
    }
    public void transaction(){
        System.out.println("Trasaction started");
    }
}
