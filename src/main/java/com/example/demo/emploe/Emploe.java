package com.example.demo.emploe;

import lombok.*;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emploe {
    private Long id ;
    private String name;
    private String email;
    private LocalDate  dob;
    private int age ;

    public Emploe(String name, String email, LocalDate dob, int age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
}
