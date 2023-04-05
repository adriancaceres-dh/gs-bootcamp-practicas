package com.glubits.repasoJPA.repository;

import com.glubits.repasoJPA.entity.Duenio;
import com.glubits.repasoJPA.entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IVeterinarioRepository extends JpaRepository<Veterinario, Integer> {

    // consultar aquellos veterinarios que tengan una especialidad en especifico.

    @Query("FROM Veterinario v WHERE v.especialidad LIKE %:especialidad%") // Esta query es el equivalente al nombre del metodo
    // Si usamos el @Query, JPA ignora el nombre del metodo.
    List<Veterinario> findVeterinarioByEspecialidadContains(@Param("especialidad") String especialidad);
    
}
