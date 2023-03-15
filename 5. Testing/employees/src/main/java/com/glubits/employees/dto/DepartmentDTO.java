package com.glubits.employees.dto;

import com.glubits.employees.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentDTO {

    private Integer id;

    private String name;

    private List<Employee> employees;
}
