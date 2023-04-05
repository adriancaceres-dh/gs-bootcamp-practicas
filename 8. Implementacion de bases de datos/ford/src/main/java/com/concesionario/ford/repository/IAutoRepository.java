package com.concesionario.ford.repository;

import com.concesionario.ford.entity.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutoRepository extends JpaRepository<Auto, Integer> {
}
