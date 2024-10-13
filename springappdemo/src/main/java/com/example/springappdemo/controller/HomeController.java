package com.example.springappdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springappdemo.pojos.Student;

@RestController
public class HomeController {
    
    @GetMapping("hello")
    public String sayHello(){
        return "Hello";
    }

    
    @GetMapping("students")
    public List<Student> getAllStudents(){
        return List.of(new Student(1L,"Amit","amit@gmail.com"),
        new Student(2L,"Alisha","alisha@gmail.com"));
    }
}
