package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Collection;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    @NotNull(message = "El nombre del alumno no puede estar vacío.")
    @Pattern(regexp = "^[A-Z].*", message = "El nombre del alumno debe comenzar con mayúscula.")
    @Size(max = 50, message = "La longitud del nombre no puede superar los 50 caracteres.")
    private String name;
    @NotBlank(message = "La lista no puede ser vacía.")
    //@Digits(integer = 2, fraction = 1)
    @DecimalMax(value="10.0", message = "La mínima nota es 0.0.")
    @DecimalMin(value = "0.0", message = "La maxima nota es 10.0")
    private List<@Valid SubjectDTO> subjects;



}
