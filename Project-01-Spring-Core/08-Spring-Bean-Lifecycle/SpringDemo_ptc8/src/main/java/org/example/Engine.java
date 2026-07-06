package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    public Engine() {
        System.out.println("Engine Bean Created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Engine Bean Initialized");
    }

    public void start() {
        System.out.println("Engine Started");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Engine Bean Destroyed");
    }
}