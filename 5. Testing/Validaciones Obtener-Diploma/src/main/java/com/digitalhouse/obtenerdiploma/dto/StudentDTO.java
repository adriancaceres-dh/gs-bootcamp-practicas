package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor //crea constructor sin parametros
@AllArgsConstructor //constructor con parametros
@Data //cera getter and setter

//al ser un DTO de entrada puede tener validaciones
//NO ES NECESATRO USAR EL @VALID ya que se va a aclarar en el metodo que implementa este dto
public class StudentDTO {

    //que el campo no este vacio
    @NotBlank(message = "El nombre del alumno no puede estar vacío.")

    //que empiece con mayuscula
    @Pattern(regexp = "^[A-Z].*$" /*expresion para que empiece con mayuscula*/, message = "El nombre del alumno debe comenzar con mayúscula.")

    //longitud maxima de 50 caracteres
    @Size(max = 50, message= "La longitud del nombre no puede superar los 50 caracteres.")

    private String name;


    @NotEmpty(message = "La lista no puede ser vacía.") //para listas usamos not empty
    @Size(min=2, message= "Deben haber al menos dos materias para realizar el promedio")
    private List<@Valid SubjectDTO> subjects; //cuando tenemos atirbutos dto dentro de otro dto se debe agregar @Valid


}
