package com.example.demo.repository;

import com.example.demo.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITutorRepository extends JpaRepository<Tutor,Integer> {
}
