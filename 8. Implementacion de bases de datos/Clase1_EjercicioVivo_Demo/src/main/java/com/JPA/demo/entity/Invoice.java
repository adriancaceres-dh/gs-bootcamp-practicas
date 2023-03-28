package com.JPA.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "factura")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    @ManyToOne //ya que es el padre, 1 solo cliente tiene muchas facturas. o es unidireccional de este lado, o es bidireccional y se coloca el mapped del onetomany.
    private Client client;

    @ManyToMany(mappedBy = "invoices") //en muchos a muchos el mapeo va en cualquiera.
    private List<Product> products;
}
