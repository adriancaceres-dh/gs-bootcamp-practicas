package com.example.concesionaria.services;

import com.example.concesionaria.dtos.VehicleDTO;
import com.example.concesionaria.dtos.VehicleWithoutServiceDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface VehicleService {
    List<VehicleWithoutServiceDTO> findAll();
    VehicleDTO findById(Integer id);
    List<VehicleDTO> findBetweenDates(LocalDate since, LocalDate to);
    List<VehicleDTO> findBetweenPrices(Double since, Double to);
    VehicleDTO addNewCar(VehicleDTO vehicleDTO);
}
