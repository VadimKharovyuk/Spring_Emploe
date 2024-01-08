package com.example.demo.repository;

import com.example.demo.emploe.Emploe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmploeRepo  extends JpaRepository<Emploe,Long> {

    Optional <Emploe> findByEmail(String email) ;
    Optional <Emploe> findById(Long id) ;
    void deleteByid (Long id);

}
