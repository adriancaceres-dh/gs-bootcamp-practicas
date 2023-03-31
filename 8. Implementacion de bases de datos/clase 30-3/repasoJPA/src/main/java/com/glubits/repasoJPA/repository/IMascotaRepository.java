package com.glubits.repasoJPA.repository;

import com.glubits.repasoJPA.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface IMascotaRepository extends JpaRepository<Mascota, Integer> {

    // quiero pedir todas las mascotas que tienen un cierto id de duenio

    @Query("FROM Mascota m WHERE m.duenio.id = :id")
    List<Mascota> findMascotaByDuenioIdEquals(@Param("id") Integer id);

    // quiero pedir todas las mascotas que coinciden con un tipo de animal y que se atienen con un veterinario especifico
    // findBy - propiedad - accion - and or not

    @Query("FROM Mascota m WHERE m.tipoAnimal = :tipo AND m.veterinario.id = :id")
    List<Mascota> findMascotaByTipoAnimalEqualsAndVeterinarioIdEquals(@Param("tipo") String tipoAnimal,
                                                                      @Param("id") Integer id);

    // Calcular cuantos pacientes de un cierto tipo tiene cada veterinario.

    @Query("SELECT new map(m.veterinario.id as id_veterinario, COUNT(*) as cantidad_tipo) FROM Mascota m WHERE m.tipoAnimal = :tipo GROUP BY m.veterinario.id")
    List<Map<String, Number>> calculateTipoAnimalPerVeterinario(@Param("tipo") String tipoAnimal);
}
