package com.example.demo.repository;

import com.example.demo.emploe.Emploe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploeRepo  extends JpaRepository<Emploe,Long> {
}
