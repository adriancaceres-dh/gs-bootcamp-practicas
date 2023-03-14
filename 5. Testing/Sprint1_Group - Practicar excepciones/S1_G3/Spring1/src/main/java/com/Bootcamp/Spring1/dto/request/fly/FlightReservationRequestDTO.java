package com.Bootcamp.Spring1.dto.request.fly;

import com.Bootcamp.Spring1.dto.request.HostDTO;
import com.Bootcamp.Spring1.dto.request.PaymentsDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightReservationRequestDTO {
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    public LocalDate dateFrom;
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    public LocalDate dateTo;
    public String origin;
    public String destination;
    public String flightNumber;
    public Integer seats;
    public String seatType;
    public List<HostDTO> people;
    public PaymentsDTO paymentMethod;
}
