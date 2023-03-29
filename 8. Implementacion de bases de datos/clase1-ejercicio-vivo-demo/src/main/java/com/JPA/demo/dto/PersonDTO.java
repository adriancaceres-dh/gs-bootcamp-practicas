package com.JPA.demo.dto;

import com.JPA.demo.entity.Client;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Integer id;

    private String firstname;

    private String lastname;

    private String dni;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    private Short age;

    private Double salary;

    private String genre;

    //private ClientDTO cliente;

}
