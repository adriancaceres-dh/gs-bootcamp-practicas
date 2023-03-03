package com.dh.blog.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntradaBlog {
    private int id; // no es necesario que lo envien
    private String title; // hace falta que lo envien
    private String nameAuthor; // hace falta que lo envien
    private LocalDate date; // no es necesario que lo envien
}