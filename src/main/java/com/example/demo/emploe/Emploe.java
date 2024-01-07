package com.example.demo.emploe;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emploe_table")
public class Emploe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
    private String email;
    private LocalDate  dob;
    @Transient
    private int age ;

    public Emploe(String name, String email, LocalDate dob, int age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    public int getAge(){
        return Period.between(this.dob,LocalDate.now()).getYears();
    }
}
