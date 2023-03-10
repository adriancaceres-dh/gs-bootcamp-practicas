package com.example.concesionaria.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VehicleWithoutServiceDTO {
    private Integer id;
    private String brand;
    private String model;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    private LocalDateTime manufacturingDate;

    private Double numberOfKilometers;
    private Double price;
    private String currency;
    private Integer countOfOwners;
}
