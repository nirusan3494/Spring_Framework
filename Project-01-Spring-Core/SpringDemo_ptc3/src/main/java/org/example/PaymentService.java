package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public PaymentService() {
        System.out.println("PaymentService Bean created ");
    }
    public void payment() {
        System.out.println("Payment Initiated");

    }
}
