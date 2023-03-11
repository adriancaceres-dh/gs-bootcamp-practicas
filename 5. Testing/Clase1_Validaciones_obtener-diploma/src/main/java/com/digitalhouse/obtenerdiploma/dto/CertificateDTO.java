package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CertificateDTO extends StudentDTO {
  private String message;
  private Double average;
  private StudentDTO student;

  public CertificateDTO(StudentDTO notes) {
  }
}
