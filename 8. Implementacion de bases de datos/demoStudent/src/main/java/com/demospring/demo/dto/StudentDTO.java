package com.demospring.demo.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {

    private Integer id;

    private String name;

    private Short edad;

    private String email;

    private Character gender;

    private List<AssignmentDTO> assignment;

}
