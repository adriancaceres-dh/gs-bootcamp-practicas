package com.example.demo.dto;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class studentDTO {
    private Integer id;

    private String nameStudent;

    private short grade;

    private short qualification;
}

