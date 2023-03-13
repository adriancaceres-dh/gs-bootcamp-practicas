package com.BootcampDH.Obtener.Diploma.controller;

import com.BootcampDH.Obtener.Diploma.dto.AlumnoDto;
import com.BootcampDH.Obtener.Diploma.dto.DiplomaDto;
import com.BootcampDH.Obtener.Diploma.service.Calculos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // iniciamos el metodo HTTP
public class ObtenerDiplomaController {

    @PostMapping("/obtenerDiploma") //metodo HTTP --> va a recibir un dto de alumno y a retonar el certificado corrrespondiente
    public DiplomaDto diploma (AlumnoDto alumno){
        Calculos calculos = new Calculos(); // instanciamos la clase para poder acceder a sus metodos

        return calculos.emitirCertificado(alumno);
    }


}
