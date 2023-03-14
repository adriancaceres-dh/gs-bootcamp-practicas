package com.example.AgenciaTurismo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PeopleDto {
    private String dni;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String email;
}

