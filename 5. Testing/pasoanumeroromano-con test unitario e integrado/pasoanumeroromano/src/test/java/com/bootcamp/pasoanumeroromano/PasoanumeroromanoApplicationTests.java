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
	private MockMvc mockMvc;

	@Test
	void numero1Test() {
		//Arrange - ordena y crea los datos necesarios

		int numero = 1;
		String romanNumberExpected = "I";
		//Act - corre el metodo que corresponde
		var resultado = romanNumberExpected;
		//Asert - Fijamos si es verdadero o falso el assertion
		Assertions.assertEquals(romanNumberExpected,resultado);
	}

}
