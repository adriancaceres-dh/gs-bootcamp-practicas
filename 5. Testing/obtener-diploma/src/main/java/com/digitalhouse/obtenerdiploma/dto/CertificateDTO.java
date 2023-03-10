package com.digitalhouse.obtenerdiploma.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CertificateDTO extends StudentDTO {
  private String message;
  private Double average;
  private StudentDTO student;

  public CertificateDTO(StudentDTO notes) {

  }
}
