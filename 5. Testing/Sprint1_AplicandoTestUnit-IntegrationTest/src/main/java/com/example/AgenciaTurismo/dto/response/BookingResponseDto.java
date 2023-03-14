package com.example.AgenciaTurismo.dto.response;

import com.example.AgenciaTurismo.dto.request.BookingDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingResponseDto {
    private String userName;
    private Double total;
    private BookingResDto booking;
    private StatusCodeDto status;
}

