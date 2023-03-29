package EjercicioMtsCuadrados.controller;

import EjercicioMtsCuadrados.service.Calculos;
import EjercicioMtsCuadrados.DTO.Propiedad;
import EjercicioMtsCuadrados.DTO.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaluarController {
    @PostMapping("/casa")
    public Response datos(@RequestBody Propiedad casa){
            Calculos calculos = new Calculos();
            Response response = new Response();

            response.setPrecio(calculos.calcularValor(casa));
            response.setHabGrande(calculos.habMasGrande(casa));
            response.setMtsCuadrados(calculos.calcularMtsCuadrados(casa));
            response.setHabitaciones(casa.getHabitaciones());


            return response;
        }
}
