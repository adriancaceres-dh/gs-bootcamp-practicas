package com.JPA.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity //indica a spring que es un equivalente a una tabla en db.
@Table(name = "persona") // propiedades especiales de una tabla
public class Person {

    @Id //INDICAMOS QUE ES UN ID
    //@GeneratedValue(strategy = GenerationType.AUTO) //GENERADO POR EL JPA. POR DEFECTO ELIGE IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTOINCREMENT -> POR EJ MYSQL
    //@GeneratedValue(strategy = GenerationType.TABLE) //GENERA A PARTIR D EUNA TABLA - LA TABLA GUARDA EL ID DEL ULTIMO ELEMENTO. MARIADB
    //@GeneratedValue(strategy = GenerationType.SEQUENCE) //GENERA ESTRUCTURAS ESPECIALES LLAMADAAS  TRIGGERS  Y CUANDO SE AGREGA  UN NUEVO CAMPO LA SECUENCIA CAMBIA DE VALOR. ORACLE
    //@GeneratedValue(strategy = GenerationType.UUID) //GENERA VALORES DE MANERA ALEATORIAS.
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 40) //GRACIAS AL ENTITY TODOS POR DEFECTO SON COLUMNAS. LAS PROPIEDADES SON COMO LAS VALIDACIONES PERO TIRA ERRORES DE DB.
    private String firstname;

    @Column(name = "apellido", nullable = false, length = 20)
    private String lastname;

    @Column(name = "documento", nullable = false, length = 8)
    private String dni;

    @Column(name = "fecha_nacimiento", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyy")
    private LocalDate birthDate;

    @Column(name = "edad", nullable = false, length = 2)
    private Short age;

    @Column(name = "salario", precision = 2) //4 partes enteras, 2 partes fraccionarias
    private Double salary;

    @Column
    private Character genre;

    // Cuando ponemos la relación en ambos, se pone un mappedBy para que priorice la otra y no haga 2 relaciones.
    // El bidireccionalismo se utiliza con JOIN. Ej. Género de una persona a través del cliente.
    @OneToOne(mappedBy = "person")
    private Client client;


}
