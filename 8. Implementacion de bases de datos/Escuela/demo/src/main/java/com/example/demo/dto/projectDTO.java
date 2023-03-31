package com.example.demo.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class projectDTO {

    private Integer id;

    private String nameProyect;

     private String responsible;

    private short term;
}
