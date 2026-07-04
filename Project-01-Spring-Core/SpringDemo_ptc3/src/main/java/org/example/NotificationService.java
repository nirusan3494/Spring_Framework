package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService() {
        System.out.println("NotificationService Bean Created");
    }
    public void  notification() {
        System.out.println("getting Notification of Payment Successfully");
    }
}
