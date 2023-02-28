package com.bootcamp.Prueba;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Convertir {
	@GetMapping("/romanoNumero/{decimal}")
	public String convertir(@PathVariable double numero){
		String[] romano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

		System.out.println("El programa toma el número de URL y lo convierte a número ROMANO");

				int[] decimales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		StringBuilder romanNumeral = new StringBuilder();
		int i = 0;
		while (numero > 0) {
			if (decimales[i] <= numero) {
				romanNumeral.append(romano[i]);
				numero -= decimales[i];
			} else {
				i++;
			}
		}
		return romanNumeral.toString();
	};

	}



//@SpringBootApplication
//public class PruebaApplication {

	//public static void main(String[] args) {
		//SpringApplication.run(PruebaApplication.class, args);
	//}


//}
