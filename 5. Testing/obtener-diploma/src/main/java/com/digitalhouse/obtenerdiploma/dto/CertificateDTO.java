package com.digitalhouse.obtenerdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificateDTO extends StudentDTO {
  private String message;
  private Double average;
  private StudentDTO student;

}
