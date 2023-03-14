package com.Bootcamp.Spring1.controller;


import com.Bootcamp.Spring1.dto.request.hotel.HotelRequestDTO;
import com.Bootcamp.Spring1.dto.response.HotelResponseDTO;
import com.Bootcamp.Spring1.model.HotelModel;
import com.Bootcamp.Spring1.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {
    @Autowired //requerimos para enlazar con el service y poder usar todas sus funcionalidades
    HotelService hotelService;

    // listado de todos los hoteles disponibles en un determinado rango de fechas y según el destino seleccionado

    @GetMapping("/api/v1/hotels")
    public List<HotelModel> listHotelAvailable(@RequestParam(required = false) String destination,
                                               @RequestParam(required = false) String dateFrom,
                                               @RequestParam(required = false) String dateTo) {
        return hotelService.availableListHotels(destination, dateFrom, dateTo);
    }

    @PostMapping("/api/v1/booking")
    public String booking(@RequestBody HotelRequestDTO datosReserva) {
        return hotelService.bookingHotel(datosReserva);
    }

    //creamos esta ruta como medio de verificacion para controlar los datos que se ingresan (postman)
    @GetMapping("/api/v1/booking")
    public HotelResponseDTO precio(@RequestBody HotelResponseDTO precioReserva) {
        return hotelService.priceHotel(precioReserva);
    }

}