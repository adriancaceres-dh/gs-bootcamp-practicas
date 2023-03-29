package com.example.concesionaria.controllers;

import com.example.concesionaria.dtos.VehicleDTO;
import com.example.concesionaria.dtos.VehicleWithoutServiceDTO;
import com.example.concesionaria.services.VehicleService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@Validated
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @GetMapping("/v1/api/vehicles")
    public List<VehicleWithoutServiceDTO> findAll() {
        return vehicleService.findAll();
    }

    @GetMapping("/v1/api/vehicles/{id}")
    public VehicleDTO findById (@PathVariable @Positive Integer id) {
        return vehicleService.findById(id);
    }

    @GetMapping("/v1/api/vehicles/dates")
    public List<VehicleDTO> findBetweenDates (
            @RequestParam("since") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate since,
            @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return vehicleService.findBetweenDates(since, to);
    }

    @GetMapping("/v1/api/vehicles/prices")
    public List<VehicleDTO> findBetweenPrices (
        @RequestParam Double since,
        @RequestParam Double to) {
        return vehicleService.findBetweenPrices(since, to);
    }

    // Postman usage:
    // POST http://localhost:8080/v1/api/vehicles/prices?since=1000&to=100000

    @PostMapping("/v1/api/vehicles")
    public VehicleDTO addNewCar(@RequestBody /*aca es mucho muy importante el @Valid*/ @Valid VehicleDTO vehicleDTO) {
        return vehicleService.addNewCar(vehicleDTO);
    }
}
