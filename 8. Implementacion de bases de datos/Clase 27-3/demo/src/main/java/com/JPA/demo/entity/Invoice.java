package com.JPA.demo.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity // indica a springboot que esto es el equivalente a una tabla de BBDD
@Table(name = "factura") // Indica propiedades especiales de la tabla
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // permite que se genere un id
    private Integer id;

    @Column(name = "fecha", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Client client;

    @ManyToMany
    private List<Product> products;
}
