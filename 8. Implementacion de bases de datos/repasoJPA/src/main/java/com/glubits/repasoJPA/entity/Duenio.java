package com.glubits.repasoJPA.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
// JPA

@Entity
@Table(name = "duenio")
public class Duenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String nombre;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String telefono;

    @Column(length = 2)
    private Short edad;

    private LocalDate fechaNacimiento;

}
