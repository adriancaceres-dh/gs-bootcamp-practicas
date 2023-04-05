package com.concesionario.ford.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "entity_autitos")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 7)
    private String patente;

    @Column(length = 20)
    private String Modelo;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Vendedor vendedor;

    @ManyToOne
    private Cliente cliente;
}
