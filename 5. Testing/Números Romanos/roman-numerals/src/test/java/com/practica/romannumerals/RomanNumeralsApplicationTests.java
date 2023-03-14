package com.practica.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RomanNumeralsApplicationTests {
  @Autowired
  RomanNumeralsRestController romanNumeralsRestController;

  @Test
  void numero1 () {
    // Arrange
    int numero = 1;
    String expected = "I";

    // Act
    var result = romanNumeralsRestController.toRoman(numero);

    // Assert
    Assertions.assertEquals(expected, result);
  }

  @Test
  void numero3 () {
    // Arrange
    int numero = 3;
    String expected = "III";

    // Act
    var result = romanNumeralsRestController.toRoman(numero);

    // Assert
    Assertions.assertEquals(expected, result);
  }

  @Test
  void numero5 () {
    // Arrange
    int numero = 5;
    String expected = "V";

    // Act
    var result = romanNumeralsRestController.toRoman(numero);

    // Assert
    Assertions.assertEquals(expected, result);
  }

  @Test
  void numero7 () {
    // Arrange
    int numero = 7;
    String expected = "VII";

    // Act
    var result = romanNumeralsRestController.toRoman(numero);

    // Assert
    Assertions.assertEquals(expected, result);
  }

  @Test
  void numero10 () {
    // Arrange
    int numero = 10;
    String expected = "X";

    // Act
    var result = romanNumeralsRestController.toRoman(numero);

    // Assert
    Assertions.assertEquals(expected, result);
  }

  @Test
  void numero50 () {
    // Arrange
    int numero = 50;
    String expected = "L";

    // Act
    var result = romanNumeralsRestController.toRoman(numero);

    // Assert
    Assertions.assertEquals(expected, result);
  }
}
