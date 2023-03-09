package com.example.concesionaria.entities;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {
    private Integer id;
    private String brand;
    private String model;
    private LocalDateTime manufacturingDate;
    private Double numberOfKilometers;
    private Double price;
    private String currency;
    private List<Service> services;
    private Integer countOfOwners;
}
