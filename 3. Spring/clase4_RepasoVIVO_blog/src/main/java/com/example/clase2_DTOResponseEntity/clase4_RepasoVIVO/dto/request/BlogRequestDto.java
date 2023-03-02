package com.example.clase2_DTOResponseEntity.clase4_RepasoVIVO.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BlogRequestDto {

    private String title; //necesitamos que lo envien. LO VAMOS A RECIBIR POR EL DTO
    private String nameAuthor; //necesitamos que lo envien. LO VAMOS A RECIBIR POR EL DTO
}
