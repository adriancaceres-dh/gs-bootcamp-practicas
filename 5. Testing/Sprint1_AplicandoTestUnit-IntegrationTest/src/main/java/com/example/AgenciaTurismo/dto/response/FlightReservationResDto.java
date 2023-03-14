package com.example.AgenciaTurismo.dto.response;

import com.example.AgenciaTurismo.dto.request.PaymentMethodDto;
import com.example.AgenciaTurismo.dto.request.PeopleDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class FlightReservationResDto {
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING, timezone="EST")
    private LocalDate dateFrom;
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING, timezone="EST")
    private LocalDate datoTo;
    private String origin;
    private String destination;
    private String flightNumber;
    private Integer seats;
    private String seatType;
    private List<PeopleDto> people;

}
