package com.glubits.employees.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

   private Integer id;

   private String name;

   private Integer age;

   private String email;

   private String address;
}
