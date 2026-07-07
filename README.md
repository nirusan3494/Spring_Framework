# Spring Framework Learning Repository

## Overview

This repository documents my hands-on journey of learning the **Spring Framework** through small, concept-focused projects. Each project explores a core Spring concept independently, helping me build a strong foundation before moving to Spring Boot and enterprise application development.

The primary goal of this repository is to understand how the Spring IoC Container manages objects, performs dependency injection, handles bean lifecycles, and supports different bean configuration approaches.

---

## Technologies Used

- Java 25
- Spring Framework 7
- Maven
- IntelliJ IDEA

---

## Spring Core Concepts Covered

### Core Concepts
- Inversion of Control (IoC)
- Dependency Injection (DI)
- Spring IoC Container
- Spring Beans
- Bean Scopes
- Bean Lifecycle

### Dependency Injection
- Constructor Injection
- Setter Injection
- Field Injection
- `@Autowired`

### Bean Configuration
- Java-Based Configuration
- XML-Based Configuration
- `@Configuration`
- `@Bean`
- `@ComponentScan`
- `@Lazy`

### Stereotype Annotations
- `@Component`
- `@Service`
- `@Repository`
- `@Controller`

### Bean Resolution
- `@Primary`
- `@Qualifier`

### Bean Properties
- `@Value`
- External Configuration using `application.properties`

### Bean Lifecycle
- `@PostConstruct`
- `@PreDestroy`

---

# Project 01 - Spring Core

| No. | Project | Concept |
|:---:|---------|---------|
| 01 | Single Bean | Creating and retrieving a Spring Bean from the IoC Container |
| 02 | Multiple Beans | Managing multiple Spring Beans |
| 03 | Developer-Laptop-Processor | Constructor Dependency Injection |
| 04 | OrderService-Payment-Notification | Multi-level Dependency Injection |
| 05 | Qualifier-Primary-Interface | Resolving multiple implementations using `@Primary` and `@Qualifier` |
| 06 | Configuration-and-Bean | Java-Based Configuration using `@Configuration` and `@Bean` |
| 07 | Stereotype-Annotations-Layered-Architecture | Component Scanning with Layered Architecture |
| 08 | Spring-Bean-Lifecycle | Bean Lifecycle using `@PostConstruct` and `@PreDestroy` |
| 09 | Setter-Injection | Setter-based Dependency Injection |
| 10 | Field-Injection | Field-based Dependency Injection |
| 11 | Lazy-Initialization | Eager vs Lazy Bean Initialization |
| 12 | Value-Annotation | Injecting Literal Values using `@Value` |
| 13 | Value-With-Properties | External Configuration using `application.properties` |
| 14 | Spring-XML-Bean-Configuration | XML Bean Configuration and `ref` Injection |

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
│   ├── 08-Spring-Bean-Lifecycle
│   ├── 09-Setter-Injection
│   ├── 10-Field-Injection
│   ├── 11-Lazy-Initialization
│   ├── 12-Value-Annotation
│   ├── 13-Value-With-Properties
│   └── 14-Spring-XML-Bean-Configuration
│
└── README.md
```

---

## Learning Outcomes

After completing these projects, I gained practical understanding of:

- Spring IoC Container
- Dependency Injection (Constructor, Setter and Field Injection)
- Bean Creation and Lifecycle
- Singleton and Prototype Bean Scopes
- Lazy Bean Initialization
- Component Scanning
- Stereotype Annotations
- Java-Based Configuration
- XML-Based Configuration
- External Property Injection
- Bean Lifecycle Management
- Layered Application Architecture

---

## Upcoming Learning Roadmap

The next phase of this repository will focus on:

### Project 02 - Spring Boot
- Spring Boot Fundamentals
- Auto Configuration
- Starter Dependencies
- Embedded Tomcat

### Project 03 - Spring MVC
- MVC Architecture
- Controllers
- Views
- Request Mapping

### Project 04 - Spring Data JPA
- Hibernate Integration
- CRUD Operations
- JPQL
- Relationships

### Project 05 - Spring Security
- Authentication
- Authorization
- JWT
- Role-Based Access Control

### Project 06 - Spring Boot REST APIs
- RESTful Services
- Validation
- Exception Handling
- Swagger/OpenAPI

### Project 07 - Microservices
- Spring Cloud
- API Gateway
- Service Discovery
- Config Server
- Docker
- Kubernetes (Basics)

---

## Purpose

This repository serves as:

- A structured record of my Spring learning journey.
- A personal reference for revising Spring concepts.
- A portfolio showcasing practical Spring Framework projects.
- A foundation for Spring Boot and enterprise Java development.
