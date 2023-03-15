package com.example.concesionaria.repositories;

import com.example.concesionaria.dtos.VehicleDTO;
import com.example.concesionaria.dtos.VehicleWithoutServiceDTO;
import com.example.concesionaria.entities.Vehicle;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class VehicleRepository {
    ModelMapper modelMapper = new ModelMapper();
    private final List<Vehicle> vehicles;

    public VehicleRepository() {
        this.vehicles = loadDatabase();
    }

    public List<VehicleWithoutServiceDTO> findAll() {
        return vehicles
                .stream()
                .map(vehicle -> modelMapper.map(vehicle, VehicleWithoutServiceDTO.class))
                .toList();
    }

    public VehicleDTO findById(Integer id) {
          var finalVehicle = vehicles
                  .stream()
                  .map(vehicle -> modelMapper.map(vehicle, VehicleDTO.class))
                  .filter(vehicle -> vehicle.getId().equals(id)).findFirst().orElse(null);

          return modelMapper.map(finalVehicle, VehicleDTO.class);
    }

    public List<VehicleDTO> findBetweenDates (LocalDate since, LocalDate to) {
        return vehicles
                .stream()
                .filter(vehicle ->
                        vehicle.getManufacturingDate().toLocalDate().isAfter(since) &&
                        vehicle.getManufacturingDate().toLocalDate().isBefore(to))
                .map(vehicle -> modelMapper.map(vehicle, VehicleDTO.class))
                .collect(Collectors.toList());
    }

    public List<VehicleDTO> findBetweenPrices (Double since, Double to) {
         return vehicles
                .stream()
                .filter(vehicle -> vehicle.getPrice() >= since && vehicle.getPrice() <= to)
                .map(vehicle -> modelMapper.map(vehicle, VehicleDTO.class))
                .collect(Collectors.toList());
    }

    public VehicleDTO addNewCar(VehicleDTO vehicleDTO) {
        Vehicle vehicle = modelMapper.map(vehicleDTO, Vehicle.class);

        if(vehicles.add(vehicle))
            return modelMapper.map(vehicle, VehicleDTO.class);
        else
            throw new RuntimeException();
    }

    private List<Vehicle> loadDatabase() {
        File file = null;

        try {
            file = ResourceUtils.getFile("classpath:vehicles.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(new JavaTimeModule());

        TypeReference<List<Vehicle>> typeReference = new TypeReference<List<Vehicle>>() {};
        List<Vehicle> vehicles = null;

        try {
            vehicles = objectMapper.readValue(file, typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vehicles;
    }
}
