package com.example.demo.service;

import com.example.demo.emploe.Emploe;
import com.example.demo.repository.EmploeRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceEmploe {

    EmploeRepo emploeRepo ;


    public List<Emploe> getAllEpmloee (){
        return emploeRepo.findAll() ;
    }
    public Emploe saveEmploee(Emploe emploe){
        Optional<Emploe> emploeOptional = emploeRepo.findByEmail(emploe.getEmail());
        if (emploeOptional.isPresent())
            throw  new IllegalStateException("пользователь с таким  Email существует") ;
        return emploeRepo.save(emploe);
    }

    public void deleteEmploe(Long id) {
        Optional<Emploe> emploeOptional = emploeRepo.findById(id);
        if (emploeOptional.isEmpty())
            throw new IllegalStateException("Такого пользователь с  id нету") ;
        emploeRepo.deleteByid(id);
    }
}
