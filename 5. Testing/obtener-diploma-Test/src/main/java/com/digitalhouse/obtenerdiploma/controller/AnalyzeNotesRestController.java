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


//------DEFINICIONES ------
//@Validates indica que las validaciones de los parametros tienen efecto sobre los mismos parametros
//@Valid indica que hay algunas validaciones dentro del objeto
@RestController
public class AnalyzeNotesRestController {
  //Recomendaciones:
  //Autowired en constructor, nunca atributos con final
  //Siempre responder con un ResponseEntity y ser claro con el estandar de codigos HTTP
  //Siempre se debe retornar un DTO y no un String solo
  private /*final*/ CertificateService certificateService;

  @Autowired
  public AnalyzeNotesRestController(CertificateService certificateService) {
    this.certificateService = certificateService;
  }

  //AGREGAMOS REPONSE ETNTITY PARA MANIPULAR LA RTA DE ERRORES
  @PostMapping("/analyzeNotes")
  public ResponseEntity<CertificateDTO> analyzeNotes(@RequestBody @Valid StudentDTO notes){
    return ResponseEntity.ok(
            certificateService.analyzeNotes(notes)
    );
  }
}
