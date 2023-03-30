package com.glubits.repasoJPA.repository;

import com.glubits.repasoJPA.entity.Duenio;
import com.glubits.repasoJPA.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMascotaRepository extends JpaRepository<Mascota, Integer> {
}
