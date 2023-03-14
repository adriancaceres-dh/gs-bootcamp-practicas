package com.Bootcamp.Spring1.dto.request.hotel;

import com.Bootcamp.Spring1.dto.request.HostDTO;
import com.Bootcamp.Spring1.dto.request.PaymentsDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookingDTO {
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dateFrom;
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dateTo;
    private String destination;
    private String hotelCode;
    private Integer peopleAmount;
    private String roomType;

    private PaymentsDTO Payments;
    private List<HostDTO> people;

}
