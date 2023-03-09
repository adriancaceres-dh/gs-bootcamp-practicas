package com.example.concesionaria.dtos;

import com.example.concesionaria.entities.Service;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder(value = {"id", "brand", "numberOfKilometers"})
// Al ser un DTO de entrada, puedo aplicarle validaciones
// Es necesario poner aca @Validated? NO.
public class VehicleDTO {

    @PositiveOrZero
    private Integer id;

    @NotBlank(message = "La marca del vehiculo no debe estar vacia o contener espacion en blanco solamente")
    private String brand;

    @NotBlank
    private String model;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    @Past
    private LocalDateTime manufacturingDate;

    @Max(value = 100000)
    @PositiveOrZero
    private Double numberOfKilometers;

    private Double price;

    private String currency;
    private List<ServiceDTO> services;
    private Integer countOfOwners;
}
