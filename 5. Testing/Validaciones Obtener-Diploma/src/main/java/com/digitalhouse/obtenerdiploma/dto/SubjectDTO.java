package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SubjectDTO {

  //que el campo no este vacio
  @NotBlank(message = "El nombre del alumno no puede estar vacío.")

  //que empiece con mayuscula
  @Pattern(regexp = "^[A-Z].*$", message = "El nombre del alumno debe comenzar con mayúscula.")

  //longitud maxima de 50 caracteres
  @Size(max = 30, message= "La longitud del nombre no puede superar los 30 caracteres.")
  private String name;

  //@Not Null aplica a numeros y todo lo demas --> Not Empty y Not Blank son solo para String
  @NotNull(message = "La nota no puede estar vacía.")

  //nota maxima y minima
  @DecimalMax(value= "10.0", message= "La maxima nota es 10.0")
  @DecimalMin(value= "0.0", message= "La minima nota es 10.0.")
  private Double score;


}