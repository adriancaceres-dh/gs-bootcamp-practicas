package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO {

  //Que el campo no esté vacío.
  @NotBlank(message = "El nombre del alumno no puede estar vacío.")
  //Que empiece con mayúscula.
  @Pattern(regexp = "^[A-Z].*", message = "El nombre del alumno debe comenzar con mayúscula.")
  //Longitud máxima de 50 caracteres.
  @Size(max = 30, message = "La longitud del nombre no puede superar los 30 caracteres.")
  private String name;

  // Aplica a numero, no puedo usar NotEmpty ni NotBlank porque no es un String ni una lista
  @NotNull(message = "La nota no puede estar vacía.")
  // Establece la cantidad entera maxima y la fraccionaria maxima
  @Digits(integer = 2, fraction = 1)
  // Establece el numero maximo
  @DecimalMax(value = "10.0", message = "La maxima nota es 10.0.")
  // Establece el numero minimo
  @DecimalMin(value = "0.0", message = "La mínima nota es 0.0.")

  // Establece un rango que debe ser si o si Long
  //@Range(min = (long) 0.0, max = (long) 9.9)
  private Double score;


}
