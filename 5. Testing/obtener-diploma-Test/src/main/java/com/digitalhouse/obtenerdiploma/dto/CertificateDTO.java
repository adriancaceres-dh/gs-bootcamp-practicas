package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CertificateDTO extends StudentDTO {
  private String message;
  private Double average;
  private StudentDTO student;


  public CertificateDTO(StudentDTO notes) {

  }
}
