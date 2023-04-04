package com.demospring.demo.dto;

import com.demospring.demo.entity.Student;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssignmentDTO {

    private Integer id;

    private String name;

    private StudentDTO student;
}
