package com.concesionario.ford.repository;

import com.concesionario.ford.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVendedorRepository extends JpaRepository<Vendedor, Integer> {
}
