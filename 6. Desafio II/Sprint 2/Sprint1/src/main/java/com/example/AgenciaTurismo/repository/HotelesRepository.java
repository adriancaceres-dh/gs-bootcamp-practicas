package com.example.AgenciaTurismo.repository;
import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.exceptions.SinHotelesException;
import com.example.AgenciaTurismo.models.FlightModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDto;
import com.example.AgenciaTurismo.models.HotelModel;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class HotelesRepository implements IHotelesRepository{
    List<HotelAvailableDto> hotelsAvailable = new ArrayList<>();


    public HotelesRepository(){
        dataBase();
    }

    public List<HotelModel> dataBase() {
        List<HotelModel> hoteles = null;

        File file;
        ObjectMapper objectMapper = new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
                .registerModule(new JavaTimeModule());
        TypeReference<List<HotelModel>> typeRef = new TypeReference<>() {};

        try {
            file = ResourceUtils.getFile("classpath:JSON/hoteles.json");
            hoteles = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert hoteles != null;
        for (HotelModel hotel : hoteles) {
            hotelsAvailable.add(new HotelAvailableDto(hotel.getCodigoHotel(),hotel.getNombre(),hotel.getLugar(),hotel.getTipoHabitacion(),
                    hotel.getPrecioNoche(),hotel.getDisponibleDesde(),hotel.getDisponibleHasta(),hotel.getReservado()));
        }

        return hoteles;

    }

    public List<HotelAvailableDto> findAll(){
        return hotelsAvailable;
    }

    public List<HotelAvailableDto> filterHotelsRep(LocalDate dateFrom, LocalDate dateTo, String destination){

        return hotelsAvailable.stream().filter(hotel -> hotel.getLugar().equalsIgnoreCase(destination) &&
                !hotel.getDisponibleDesde().isAfter(dateFrom) &&
                !hotel.getDisponibleHasta().isBefore(dateTo) &&
                !hotel.getReservado()).collect(Collectors.toList());
    }

    public HotelAvailableDto findHotel(String code){

        return hotelsAvailable.stream().filter(hotel -> hotel.getCodigoHotel().equalsIgnoreCase(code))
                .findFirst().orElse(null);

    }

}
