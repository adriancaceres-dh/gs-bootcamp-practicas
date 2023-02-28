package ejemplo_calculadora.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class Calculadora {

    @GetMapping("/")
    public String inicio(){
        return "Para calcular tu edad, coloca en la URL tu fecha de nacimiento en el siguiente formato: año, mes, dia";
    }

    @GetMapping("/{año}/{mes}/{dia}")
    public String calcularEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer año){
        Period age;
        LocalDate date = LocalDate.of(año, mes, dia);
        age = Period.between(date, LocalDate.now());

        return "Tu cumpleaños es el " + dia + " del mes " + mes + ". Y tenes " + age.getYears() + "años";
     }
}
