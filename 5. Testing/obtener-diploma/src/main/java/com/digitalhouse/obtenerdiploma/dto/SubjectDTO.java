package com.digitalhouse.obtenerdiploma.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO {
  @NotNull(message = "El nombre del alumno no puede estar vacío.")
  @Pattern(regexp = "^[A-Z].*", message = "El nombre del alumno debe comenzar con mayúscula.")
  @Size(max = 50, message = "La longitud del nombre no puede superar los 50 caracteres.")
  private String subject;
  @NotNull(message = "El nombre del alumno no puede estar vacío.")
  @Size(min=2, message = "Deben haber dos materias para poder calcular el promedio")
  private Integer note;



}
