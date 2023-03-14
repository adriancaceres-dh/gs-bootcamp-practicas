package com.example.AgenciaTurismo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingDto {
    private LocalDate dateFrom;
    private LocalDate datoTo;
    private String destination;
    private String hotelCode;
    private Integer peopleAmount;
    private String roomType;
    private List<PeopleDto> people;
    private PaymentMethodDto paymentMethod;
}

