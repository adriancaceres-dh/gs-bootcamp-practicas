package com.JPA.demo.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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

    @Column(length = 100)
    private String email;

    @Column(name = "numeroTarjeta")
    private String cardNumber;

    @OneToOne()
    //@JoinColumn(name="id_persona") //esto se usa para modificar la relacion, pero no hace falta ponerlo.
    private Person person;

    @OneToMany(mappedBy = "client") // generalmente son unidireccionales del lado del OneToMany o son bidireccionales.
    private List<Invoice> invoices;
}
