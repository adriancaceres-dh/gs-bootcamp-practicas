package com.JPA.demo.dto;

import com.JPA.demo.entity.Invoice;
import com.JPA.demo.entity.Person;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private Integer id;

    private String email;

    private String cardNumber;

    private PersonDTO Person;

}
