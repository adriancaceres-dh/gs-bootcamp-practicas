package com.demospring.demo.dto;

import com.demospring.demo.entity.Assignment;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {

    private Integer id;

    private String name;

    private Short edad;

    private String email;

    private Character gender;


    private List<Assignment> assignments;

}
