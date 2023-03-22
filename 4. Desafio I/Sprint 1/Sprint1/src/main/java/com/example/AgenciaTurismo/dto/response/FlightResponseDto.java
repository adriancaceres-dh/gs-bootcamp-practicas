package com.example.AgenciaTurismo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FlightResponseDto {
    private String userName;
    private Double total;
    private FlightReservationResDto flightReservation;
    private StatusCodeDto status;
}
