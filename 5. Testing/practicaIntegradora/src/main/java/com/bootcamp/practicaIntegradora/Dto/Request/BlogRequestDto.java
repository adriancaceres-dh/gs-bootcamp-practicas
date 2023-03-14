package com.bootcamp.practicaIntegradora.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BlogRequestDto {
    @NotBlank
    private String title;
    @NotBlank
    private String nameAuthor;
}
