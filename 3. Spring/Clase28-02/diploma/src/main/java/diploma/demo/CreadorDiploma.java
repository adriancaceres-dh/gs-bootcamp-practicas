package diploma.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class CreadorDiploma {
    @PostMapping("/crear/diploma")
    public Diploma getDiploma (@RequestBody Alumno alumno) {
        Diploma diploma = new Diploma(alumno.getNombre());
        diploma.calcularPromedio(alumno.getLista());
        diploma.saludo();
        return diploma;
    }
}
