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

    // Relación 1 a 1 con person.
    // Si lo ponemos en ambas tablas(bidireccional), en una de ellas ponemos el mappedBy para evitar la doble relación en la db.
    // Persist hace que al ingresar por postman un cliente con un person que no existe, me la cree en person.
    @OneToOne(cascade = CascadeType.PERSIST)
    private Person person;
    //<--- ATENCIÓN! ---> Cuando agrego un cliente nuevo, con un id de persona que ya existe, me genera un cliente nuevo pero me busca
    // la persona con dicho id en lugar de crear una person nueva haciendo la unión. agrego el cascadeType.MERGE. Esto pasa cuando es UNIDIRECCIONAL.

    //<--- ATENCIÓN! ---> Cuando el person no existe no lo permite porque no existe esa person guardada, para ello
    // agrego el cascadeType.PERSIST. Esto pasa cuando es UNIDIRECCIONAL.

    //<--- ATENCIÓN! ---> Ahora, cuando la relación es BIDIRECCIONAL (agregar el OneToOne en Client) hay que modificar
    // el save de client en este caso.


    // Un cliente tiene muchas facturas por lo que OneToMany va en el padre.
    // Ponemos el mappedBy para evitar una tabla intermedia (ya que le indicamos la relación en ambos lados).
    // El mappedBy, por lo general, el intellij me deja ponerlo en un solo lado. No puede mapear una lista, ya que hay muchos id, por lo tanto, mapea client.
    // La relación de 1 a muchos o es bidireccional(mapeando desde el OneToMany) o es unidireccional del lado del OneToMany.
    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST)
    private List<Invoice> invoices;
}
