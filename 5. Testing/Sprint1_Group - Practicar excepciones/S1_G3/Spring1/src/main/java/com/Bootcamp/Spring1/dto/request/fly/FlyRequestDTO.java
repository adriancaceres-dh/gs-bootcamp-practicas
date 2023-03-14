package com.Bootcamp.Spring1.dto.request.fly;

import com.Bootcamp.Spring1.dto.request.PaymentsDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlyRequestDTO {
    private String userName;
    private FlightReservationRequestDTO flightReservation;
    private PaymentsDTO paymentMethod;

}
