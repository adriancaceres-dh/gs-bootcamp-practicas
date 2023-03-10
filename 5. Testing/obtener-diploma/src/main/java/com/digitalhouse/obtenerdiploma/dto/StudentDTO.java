package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class
StudentDTO {

    //Que el campo no esté vacío.
    @NotBlank(message = "El nombre del alumno no puede estar vacío.")
    //Que empiece con mayúscula.
    @Pattern(regexp = "^[A-Z].*", message = "El nombre del alumno debe comenzar con mayúscula.")
    //Longitud máxima de 50 caracteres.
    @Size(max = 50, message = "La longitud del nombre no puede superar los 50 caracteres.")
    private String name;

    @NotEmpty(message = "La lista no puede estar vacia.")
    @Size(min = 2, message = "Deben haber al menos 2 materias para poder realizar un promedio.")
    private List<@Valid SubjectDTO> subjects;

}
