package com.JPA.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity // indica a springboot que esto es el equivalente a una tabla de BBDD
@Table(name = "producto") // Indica propiedades especiales de la tabla
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // permite que se genere un id
    private Integer id;

    @Column(name = "nombreProducto", nullable = false, length = 40)
    private String name;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "productsXInvoices",
            joinColumns = @JoinColumn(name = "iid", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "pid", referencedColumnName = "id")
    )
    private Set<Invoice> invoices;
}
