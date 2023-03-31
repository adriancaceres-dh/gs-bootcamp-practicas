package com.glubits.repasoJPA.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
// JPA

@Entity
@Table(name = "veterinario")
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String nombre;

    @Column(length = 10)
    private String matricula;

    @Column(length = 100)
    private String especialidad;

    @Column(length = 100)
    private String horario;

    @Column(length = 20)
    private String telefono;

}
