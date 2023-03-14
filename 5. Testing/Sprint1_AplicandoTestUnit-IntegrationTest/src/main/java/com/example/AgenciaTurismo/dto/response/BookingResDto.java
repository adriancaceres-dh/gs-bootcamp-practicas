package com.example.AgenciaTurismo.dto.response;

import com.example.AgenciaTurismo.dto.request.PeopleDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingResDto {
    private LocalDate dateFrom;
    private LocalDate datoTo;
    private String destination;
    private String hotelCode;
    private Integer peopleAmount;
    private String roomType;
    private List<PeopleDto> people;
}