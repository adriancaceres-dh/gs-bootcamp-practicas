package com.example.AgenciaTurismo.controller;

import com.example.AgenciaTurismo.dto.request.BookingRequestDto;
import com.example.AgenciaTurismo.dto.response.BookingResponseDto;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDto;
import com.example.AgenciaTurismo.service.HotelesService;
import com.example.AgenciaTurismo.service.IHotelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@RestController
@Validated
@RequestMapping("/api/v1/")
public class HotelesController {
    @Autowired
    IHotelesService hotelesService;

    @GetMapping("/hotels")
    public List<HotelAvailableDto> searchAllHotels(){

        return hotelesService.searchAll();
    }

    @GetMapping("/hotel")
    public List<HotelAvailableDto> filterHotels(@RequestParam("dateFrom") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dateFrom,
                                                @RequestParam("dateTo") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dateTo,
                                                @RequestParam("destination") String destination ){

        return hotelesService.filterHotels(dateFrom, dateTo, destination);
    }

    @PostMapping("/booking")
    public BookingResponseDto booking(@RequestBody @Valid BookingRequestDto bookingRequest){

        return hotelesService.bookingResponse(bookingRequest);
    }
}
