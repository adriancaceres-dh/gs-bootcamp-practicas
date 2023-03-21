package com.glubits.employees.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Department {

    private Integer id;

    private String name;

    private List<Employee> employees;

}
