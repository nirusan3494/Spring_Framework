# Spring Framework Learning Repository

## Overview

This repository documents my hands-on learning journey through the Spring Framework Core. Each project focuses on a single concept and is implemented independently to build a strong understanding of Spring's internal architecture before moving to Spring Boot and enterprise application development.

The objective of this repository is to understand how the Spring IoC Container manages objects, performs dependency injection, handles bean lifecycles, and supports various configuration approaches.

---

## Technologies

- Java 25
- Spring Framework 7
- Maven
- IntelliJ IDEA

---

## Spring Core Concepts Covered

- Inversion of Control (IoC)
- Dependency Injection (DI)
- Constructor Injection
- Spring Beans
- Bean Scopes
- Component Scanning
- Stereotype Annotations
- `@Component`
- `@Service`
- `@Repository`
- `@Controller`
- `@Autowired`
- `@Primary`
- `@Qualifier`
- Java-Based Configuration
- `@Configuration`
- `@Bean`
- Bean Lifecycle
- `@PostConstruct`
- `@PreDestroy`

---

## Projects

| Project | Description |
|---------|-------------|
| 01-Single-Bean | Creating and retrieving a single Spring Bean from the IoC container |
| 02-Multiple-Beans | Managing multiple beans inside the Spring container |
| 03-Developer-Laptop-Processor | Constructor Dependency Injection using multiple dependent objects |
| 04-OrderService-Payment-Notification | Multi-level dependency injection demonstrating layered object relationships |
| 05-Qualifier-Primary-Interface | Resolving multiple implementations using `@Primary` and `@Qualifier` |
| 06-Configuration-and-Bean | Java-based configuration using `@Configuration` and `@Bean` |
| 07-Stereotype-Annotations-Layered-Architecture | Component scanning and layered architecture using stereotype annotations |
| 08-Spring-Bean-Lifecycle | Bean initialization and destruction using `@PostConstruct` and `@PreDestroy` |

---

## Repository Structure

```text
Spring_Framework
│
├── Project-01-Spring-Core
│   ├── 01-Single-Bean
│   ├── 02-Multiple-Beans
│   ├── 03-Developer-Laptop-Processor
│   ├── 04-OrderService-Payment-Notification
│   ├── 05-Qualifier-Primary-Interface
│   ├── 06-Configuration-and-Bean
│   ├── 07-Stereotype-Annotations-Layered-Architecture
│   └── 08-Spring-Bean-Lifecycle
│
└── README.md
```

---

## Learning Outcomes

After completing these projects, I gained practical understanding of:

- How the Spring IoC Container manages objects.
- Constructor-based dependency injection.
- Bean creation and lifecycle management.
- Singleton and Prototype bean scopes.
- Component scanning and stereotype annotations.
- Java-based configuration using `@Configuration` and `@Bean`.
- Bean lifecycle callbacks using `@PostConstruct` and `@PreDestroy`.
- Layered application architecture following Controller-Service-Repository design.

---

## Next Step

The next phase of this learning journey focuses on Spring Boot, including:

- Spring Boot Fundamentals
- Auto Configuration
- Starter Dependencies
- Embedded Web Server
- Spring Boot REST APIs
- Spring Data JPA
- Hibernate Integration
- Spring Security
- Microservices

---

## Purpose

This repository serves as a personal reference, a structured learning resource, and a demonstration of my understanding of Spring Framework Core concepts through practical implementation.
