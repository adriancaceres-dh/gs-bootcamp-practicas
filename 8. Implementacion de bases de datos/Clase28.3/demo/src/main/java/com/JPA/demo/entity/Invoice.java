package com.JPA.demo.entity;

import javax.persistence.*;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "factura")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fechaFacturacion")
    private LocalDate date;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Client client;

    @ManyToMany
    private List<Product> products;
}
