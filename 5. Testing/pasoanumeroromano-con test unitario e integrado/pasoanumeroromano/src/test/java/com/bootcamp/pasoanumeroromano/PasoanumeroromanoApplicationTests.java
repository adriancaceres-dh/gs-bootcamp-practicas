package com.bootcamp.pasoanumeroromano;

import com.bootcamp.pasoanumeroromano.controller.NumeroRomano;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PasoanumeroromanoApplicationTests {

	@Autowired
	//private MockMvc mockMvc; no se utiliza (porque es test unitario)
	NumeroRomano numeroRomano;
	@Test
	void numero1Test() {
		//Arrange - ordena y crea los datos necesarios

		int numero = 1;
		String romanNumberExpected = "I";
		//Act - corre el metodo que corresponde
		var resultado = numeroRomano.pasarARomano(numero);
		//Asert - Fijamos si es verdadero o falso el assertion
		Assertions.assertEquals(romanNumberExpected,resultado);
	}
	@Test
	void numero5Test() {
		//Arrange - ordena y crea los datos necesarios

		int numero = 5;
		String romanNumberExpected = "V";
		//Act - corre el metodo que corresponde
		var resultado = numeroRomano.pasarARomano(numero);
		//Asert - Fijamos si es verdadero o falso el assertion
		Assertions.assertEquals(romanNumberExpected,resultado);
	}
	@Test
	void numero7Test() {
		//Arrange - ordena y crea los datos necesarios

		int numero = 7;
		String romanNumberExpected = "VII";
		//Act - corre el metodo que corresponde
		var resultado = numeroRomano.pasarARomano(numero);
		//Asert - Fijamos si es verdadero o falso el assertion
		Assertions.assertEquals(romanNumberExpected,resultado);
	}
	@Test
	void numero10Test() {
		//Arrange - ordena y crea los datos necesarios

		int numero = 10;
		String romanNumberExpected = "X";
		//Act - corre el metodo que corresponde
		var resultado = numeroRomano.pasarARomano(numero);
		//Asert - Fijamos si es verdadero o falso el assertion
		Assertions.assertEquals(romanNumberExpected,resultado);
	}
	@Test
	void numero50Test() {
		//Arrange - ordena y crea los datos necesarios

		int numero = 50;
		String romanNumberExpected = "L";
		//Act - corre el metodo que corresponde
		var resultado = numeroRomano.pasarARomano(numero);
		//Asert - Fijamos si es verdadero o falso el assertion
		Assertions.assertEquals(romanNumberExpected,resultado);
	}

}
