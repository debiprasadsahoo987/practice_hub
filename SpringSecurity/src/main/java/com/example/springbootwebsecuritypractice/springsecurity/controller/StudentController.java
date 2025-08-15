package com.example.springbootwebsecuritypractice.springsecurity.controller;

import com.example.springbootwebsecuritypractice.springsecurity.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "John Doe", 85),
            new Student(2, "Jane Smith", 90),
            new Student(3, "Alice Johnson", 78),
            new Student(4, "Bob Brown", 92)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

}
