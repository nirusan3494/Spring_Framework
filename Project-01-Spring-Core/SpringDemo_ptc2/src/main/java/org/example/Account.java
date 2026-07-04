package org.example;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private final TransactionService transactionService;
    public Account(TransactionService transactionService){
        this.transactionService=transactionService;
        System.out.println("Account Bean Created");
    }
    public void details(){
        System.out.println("Bank Details are Shown");
         transactionService.transaction();
    }
}
