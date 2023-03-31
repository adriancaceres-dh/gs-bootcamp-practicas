package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
// JPA

@Entity
@Table(name = "proyecto")

public class project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name="nombre_proyecto",length = 60 )
    private String nameProyect;

    @Column (name="responsable",length =20)
    private String responsible;

    @Column (name="plazo")
    private short term;

}
