package com.glubits.repasoJPA.repository;

import com.glubits.repasoJPA.entity.Duenio;
import com.glubits.repasoJPA.entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVeterinarioRepository extends JpaRepository<Veterinario, Integer> {
}
