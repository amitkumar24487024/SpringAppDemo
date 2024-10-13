package com.example.springappdemo.pojos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Student {
    private Long id;
    private String name;
    private String email;
    public Student(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    } 
    
}

