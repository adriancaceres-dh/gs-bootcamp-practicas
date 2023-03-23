package com.bootcamp.NumeroRomano;

import com.bootcamp.NumeroRomano.controller.RomanoController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class NumeroRomanoApplicationTestsController {

	@Autowired
	RomanoController romanoController;

	@Test
	void numero1 () {
		// Arrange
		int numero = 1;
		String expected = "I";

		// Act
		var result = RomanoController.pasarRomano(numero);

		// Assert
		Assertions.assertEquals(expected, result);
	}

	@Test
	void numero3 () {
		// Arrange
		int numero = 3;
		String expected = "III";

		// Act
		var result =RomanoController.pasarRomano(numero);

		// Assert
		Assertions.assertEquals(expected, result);
	}

	@Test
	void numero5 () {
		// Arrange
		int numero = 5;
		String expected = "V";

		// Act
		var result = RomanoController.pasarRomano(numero);

		// Assert
		Assertions.assertEquals(expected, result);
	}

	@Test
	void numero7 () {
		// Arrange
		int numero = 7;
		String expected = "VII";

        // Act
		var result = RomanoController.pasarRomano(numero);
		// Assert
		Assertions.assertEquals(expected, result);
	}

	@Test
	void numero10 () {
		// Arrange
		int numero = 10;
		String expected = "X";

		// Act
		var result = RomanoController.pasarRomano(numero);

		// Assert
		Assertions.assertEquals(expected, result);
	}

	@Test
	void numero50 () {
		// Arrange
		int numero = 50;
		String expected = "L";

		// Act
		var result =RomanoController.pasarRomano(numero);

		// Assert
		Assertions.assertEquals(expected, result);
	}

}
