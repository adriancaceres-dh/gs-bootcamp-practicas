package com.JPA.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
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

    @Column(name = "fecha", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    // Un cliente tiene muchas facturas, por lo que ManyToOne va del lado del hijo (muchas).
    // La relación OneToMany es unidireccional de este lado, o es bidireccional y se coloca el mapped del onetomany.
    @ManyToOne
    private Client client;

    // En la relación muchos a muchos el mapeo va en cualquiera.
    @ManyToMany(mappedBy = "invoices")
    private List<Product> products;
}
