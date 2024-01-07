package com.example.demo.controller;

import com.example.demo.emploe.Emploe;
import com.example.demo.service.ServiceEmploe;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@AllArgsConstructor
public class controller {
    ServiceEmploe serviceEmploe ;
    @GetMapping("/")
    public List<Emploe> getallEmploe() {
        return serviceEmploe.getAllEpmloee();

    }
    @PostMapping
    public Emploe saveEmploee(@RequestBody Emploe emploe){
        return serviceEmploe.saveEmploee(emploe);

    }
}
