package com.example.concesionaria.services;

import com.example.concesionaria.dtos.VehicleDTO;
import com.example.concesionaria.dtos.VehicleWithoutServiceDTO;
import com.example.concesionaria.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public List<VehicleWithoutServiceDTO> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public VehicleDTO findById(Integer id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public List<VehicleDTO> findBetweenDates(LocalDate since, LocalDate to) {
        return vehicleRepository.findBetweenDates(since, to);
    }

    @Override
    public List<VehicleDTO> findBetweenPrices(Double since, Double to) {
        return vehicleRepository.findBetweenPrices(since, to);
    }

    @Override
    public VehicleDTO addNewCar(VehicleDTO vehicleDTO) {
        return vehicleRepository.addNewCar(vehicleDTO);
    }
}
