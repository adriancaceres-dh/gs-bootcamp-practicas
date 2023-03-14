package com.bootcamp.calculadora.ej_1SpringBoot_JSON;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ej1SpringBootJsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ej1SpringBootJsonApplication.class, args);
    }

}


//package com.bootcamp.Prueba;
//
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDateTime;
//
//@RestController
//
//public class CalcularEdad {
//
//	@GetMapping("/{dia}/{mes}/{anio}")
//	public static int CalcularEdad (@PathVariable Integer dia ,@PathVariable Integer mes, @PathVariable int anio){
//		LocalDateTime FechaActual = LocalDateTime.now();
//		System.out.println(LocalDateTime.now());
//		int diaActual = FechaActual.getDayOfMonth();
//		int mesActual = FechaActual.getMonth().getValue() + 1;
//		int anioActual = FechaActual.getYear() +1900;
//		int FechaNacimiento = dia+mes+anio;
//		int Diferencia = (FechaActual - FechaNacimiento);
//
//		if (mesActual<=mes){
//				if(mesActual==mes){
//					return (Diferencia);
//				}else {
//					return (Diferencia);
//				}
//		}}}
//
//


//@SpringBootApplication
//public class PruebaApplication {

	//public static void main(String[] args) {
		//SpringApplication.run(PruebaApplication.class, args);
	//}


//}
