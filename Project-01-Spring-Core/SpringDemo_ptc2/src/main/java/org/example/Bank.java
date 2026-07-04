package org.example;

import org.springframework.stereotype.Component;

@Component
public class Bank {
    private final Account account;
    public Bank(Account account){
        this.account=account;
        System.out.println("Bean Created for bank");
    }
    public void login(){
        System.out.println("Bank logging into account");
        account.details();
    }

}
