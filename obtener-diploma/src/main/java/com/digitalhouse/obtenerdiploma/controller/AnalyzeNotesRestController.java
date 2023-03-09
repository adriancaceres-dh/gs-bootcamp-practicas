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

  // Recomendaciones:
  // Autowired en constructor, nunca atributos con final
  // Siempre responder con un ResponseEntity y ser claro con el estardar de codigos HTTP
  // Ademas, siempre se debe retornar un DTO y no un String solo.
  private CertificateService certificateService;

  @Autowired
  public AnalyzeNotesRestController(CertificateService certificateService) {
    this.certificateService = certificateService;
  }

  @PostMapping("/analyzeNotes")
  public ResponseEntity<CertificateDTO> analyzeNotes(@RequestBody @Valid StudentDTO notes){
    return ResponseEntity.ok(
            certificateService.analyzeNotes(notes)
    );
  }
}
