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

@Entity // indica a springboot que esto es el equivalente a una tabla de BBDD
@Table(name = "persona") // Indica propiedades especiales de la tabla
public class Person {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO) // permite que JPA elija por nosotros
    @GeneratedValue(strategy = GenerationType.IDENTITY) // permite que se genere un id
    // unico en base al generador autoincremental, por ejemplo, MYSQL.
    //@GeneratedValue(strategy = GenerationType.TABLE) // genera a partir de una tabla. MariaDB
    //@GeneratedValue(strategy = GenerationType.SEQUENCE) // genera estructuras especiales que se llaman triggers y cuando
    // se agrega un nuevo campo, la secuencia cambia de valor. Oracle
    //@GeneratedValue(strategy = GenerationType.UUID) // genera valores de forma aleatoria.
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 40)
    private String firstname;

    @Column(name = "apellido", nullable = false, length = 20)
    private String lastname;

    @Column(name = "documento", nullable = false, length = 8)
    private String dni;

    @Column(name = "fechaNacimiento", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    @Column(name = "edad", nullable = false, scale = 2)
    private Short age;

    @Column(name = "salario", precision = 2)
    private Double salary;

}
