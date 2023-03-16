package com.dh.blog.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntradaBlog {
    private Integer id; // no es necesario que lo envien
    private String title; // hace falta que lo envien
    private String nameAuthor; // hace falta que lo envien
    private LocalDate date; // no es necesario que lo envien
}