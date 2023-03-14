package com.bootcamp.practicaIntegradora.Model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntryBlog {
    private Integer id; // no es necesario que lo envíen
    private String title;
    private String nameAuthor;
    private LocalDate date; // no es necesario que lo envíen
}
