package com.glubits.repasoJPA.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
// JPA

@Entity
@Table(name = "mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 2)
    private Short edad;

    @Column(length = 100)
    private String tipoAnimal;

    @Column(length = 100)
    private String raza;

    @Column(length = 100)
    private String nombre;

    @ManyToOne(cascade = {CascadeType.ALL}) //Permite guarda paciente con datos de tutor(no existente anteriormente) Para crear ahora, con id de tutor ya creado modifico el save.
    private Duenio duenio;

    @ManyToOne()
    private Veterinario veterinario;
}
