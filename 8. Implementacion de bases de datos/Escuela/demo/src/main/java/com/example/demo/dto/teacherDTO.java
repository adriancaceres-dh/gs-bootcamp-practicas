package com.example.demo.dto;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class teacherDTO {
    private Integer id;

    private String nameTeacher;

    private short assignament;
}

