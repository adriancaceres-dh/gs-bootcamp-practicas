package com.bootcamp.practicaIntegradora.Dto.Request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BlogRequestDto {
    @NotBlank
    private String title;
    @NotBlank
    private String nameAuthor;
}
