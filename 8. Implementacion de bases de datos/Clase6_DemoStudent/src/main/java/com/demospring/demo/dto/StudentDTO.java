package com.demospring.demo.dto;

import com.demospring.demo.entity.Assignment;
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

    private Short age;

    private String email;

    private Character gender;

    private List<Assignment> assignments;

}