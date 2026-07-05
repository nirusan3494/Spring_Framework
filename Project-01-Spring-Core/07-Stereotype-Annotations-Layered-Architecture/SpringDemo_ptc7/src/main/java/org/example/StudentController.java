package org.example;

import org.springframework.stereotype.Controller;


@Controller
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
        System.out.println("Created Controller Bean");
    }

    public void registerStudent(){
        System.out.println("Student data  being received ");
        studentService.registerStudent();
    }
    public void getStudents(){
        System.out.println("Students data being fetched");
        studentService.getStudent();
    }
    public void updateStudents(){
        System.out.println("Student being updated ");
        studentService.updateStudent();
    }
}
