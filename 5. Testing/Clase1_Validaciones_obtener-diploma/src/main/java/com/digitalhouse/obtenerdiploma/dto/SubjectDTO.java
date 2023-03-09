package com.digitalhouse.obtenerdiploma.dto;

import javax.validation.constraints.*;

public class SubjectDTO {
  @NotBlank(message = "El nombre de la materia no puede estar vacío")
  @Size(max = 30, message = "La longitud del nombre no puede superar los 30 caracteres.")
  private String subject;

  @NotNull(message = "La nota no puede estar vacía.")
  @Max(value = 10, message = "La nota máxima es 10.")
  @Min(value = 0, message = "La nota mínima es 0.")
  private Integer note;

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Integer getNote() {
    return note;
  }

  public void setNote(Integer note) {
    this.note = note;
  }

}
