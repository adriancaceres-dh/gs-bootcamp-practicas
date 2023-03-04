package metroscuadrados.controller;

import metroscuadrados.dto.PropiedadDTO;
import metroscuadrados.service.InmobiliariaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlladorInmobiliaria {
    private final InmobiliariaService inmobiliariaService;

    public ControlladorInmobiliaria(InmobiliariaService inmobiliariaService) {
        this.inmobiliariaService = inmobiliariaService;

    }

    @PostMapping("/inmobiliaria/calcularm2")

    public ResponseEntity<String> calcularm2(@RequestBody PropiedadDTO p) {
        String respuesta = "";
        try {
            return new ResponseEntity<>(inmobiliariaService.CantidadM2(p), HttpStatus.OK);
        } catch (Exception e) {
            respuesta = "No hay materias para calcular el promedio";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }

    }
}
