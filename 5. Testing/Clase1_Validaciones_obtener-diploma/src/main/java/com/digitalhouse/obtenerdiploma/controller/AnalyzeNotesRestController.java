package com.digitalhouse.obtenerdiploma.controller;

import com.digitalhouse.obtenerdiploma.dto.StudentDTO;
import com.digitalhouse.obtenerdiploma.dto.CertificateDTO;
import com.digitalhouse.obtenerdiploma.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AnalyzeNotesRestController {
  private CertificateService certificateService;

  //Constructor del service.
  //Siempre responder con responseEntity y ser claro con el estandar de codigos HTTP.
  //Siempre retornar un DTO y no string.

  @Autowired
  public AnalyzeNotesRestController(CertificateService certificateService) {
    this.certificateService = certificateService;
  }

  @PostMapping("/analyzeNotes")
  public ResponseEntity<CertificateDTO> analyzeNotes(@RequestBody @Valid StudentDTO notes){
    //con response entity manipulamos la rta y no un 200 404 que manda spring por defecto.

    return ResponseEntity.ok(
            certificateService.analyzeNotes(notes)
    );
  }
}
