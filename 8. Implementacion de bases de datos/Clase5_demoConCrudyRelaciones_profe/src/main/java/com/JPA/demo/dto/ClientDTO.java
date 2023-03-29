package com.JPA.demo.dto;

import javax.persistence.Column;

import com.JPA.demo.entity.Invoice;
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

    private PersonDTO person;
}
