package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public OrderService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        System.out.println("OrderService Bean created");
    }



    public void createOrder() {
        System.out.println("Order Created by customer");
        paymentService.payment();
        notificationService.notification();
    }
}
