package com.certificado.certificado;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controllers {
   @PostMapping ("/cliente")
   public void crearCLiente (@RequestBody Cliente cli) {

      System.out.println("CLiente creado");
      System.out.println("Nombre: " + cli.getNombre());
      System.out.println("Apellido " + cli.getApellido());

   }
}


