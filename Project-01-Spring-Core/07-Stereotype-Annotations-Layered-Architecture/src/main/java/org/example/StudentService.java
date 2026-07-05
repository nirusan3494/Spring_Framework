package org.example;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
        System.out.println("Created StudentService Bean");
    }
    public void registerStudent(){
        System.out.println("Student data being registered");
        studentRepository.findById();
    }
    public void getStudent(){
        System.out.println("Student data being received ");
        studentRepository.savebyId();
    }
    public void updateStudent(){
        System.out.println("Student being updated");
        studentRepository.updateBYId();
    }

}
