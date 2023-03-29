package com.JPA.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "cliente")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(name = "numero_tarjeta", length = 16)
    private String cardNumber;

    @OneToOne(cascade = CascadeType.PERSIST) //Relacion 1 a 1 con client. //Persist hace que al ingresar por postman un cliente con un person que no existe, me la cree en person. Si lo ponemos en ambas tablas, en una de ellas ponemos el mappedBy para evitar la doble relacion en la db.
    private Person person;

    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST) //un cliente tiene muchas facturas por lo que este va en el hijo. De cada factura mappea el id del cliente. Esto evida que mysql cree una tabla intermedia.
    private List<Invoice> invoices;
}
