package com.glubits.repasoJPA.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.glubits.repasoJPA.entity.Duenio;
import com.glubits.repasoJPA.entity.Veterinario;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MascotaDTO {

    private Integer id;

    private Short edad;

    private String tipoAnimal;

    private String raza;

    private String nombre;

    private Duenio duenio;

    private Veterinario veterinario;

}
