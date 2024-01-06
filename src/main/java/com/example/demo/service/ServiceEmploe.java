package com.example.demo.service;

import com.example.demo.emploe.Emploe;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class ServiceEmploe {
    public List<Emploe> getEmploe (){
        return  List.of(new Emploe(
                1L,
                "Vadim",
                "vadim@mail.com",
                LocalDate.of(1993, Month.NOVEMBER,10
                ), 30
        )) ;
    }
}
