package com.example.demo.service;

import com.example.demo.emploe.Emploe;
import com.example.demo.repository.EmploeRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
@AllArgsConstructor
public class ServiceEmploe {

    EmploeRepo emploeRepo ;


    public List<Emploe> getAllEpmloee (){
        return emploeRepo.findAll() ;
    }
    public Emploe saveEmploee(Emploe emploe){
        return emploeRepo.save(emploe);
    }
}
