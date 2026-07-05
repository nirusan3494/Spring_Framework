package org.example;


import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public StudentRepository(){
        System.out.println("Created StudentRepository Bean");
    }
    public void savebyId(){
        System.out.println("Student saved by id");

    }
    public void findById() {
        System.out.println("Student found by id");

    }
    public void updateBYId() {
        System.out.println("Student updated by id");

    }
}
