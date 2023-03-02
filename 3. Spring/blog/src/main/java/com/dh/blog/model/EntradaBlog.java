package com.dh.blog.model;

import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntradaBlog {
    private Integer id; // no es necesario que lo envien.
    private String title; // required
    private String nameAuthor; // required
    private LocalDate date; // not required
}
