package com.practica.romannumerals.unit;

import com.practica.romannumerals.RomanNumeralsRestController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RomanNumeralsRestControllerTest {

    @Autowired
    RomanNumeralsRestController romanNumeralsRestController;

@Test
    public void toRomanI(){
    // arrange
    Integer numero = 1;
    String expected = "I";

    //act
    var result = romanNumeralsRestController.toRoman(numero);
    System.out.println(numero);
    //assert
    Assertions.assertEquals(expected, result);
}
    @Test
    public void toRomanIII(){
        // arrange
        Integer numero = 3;
        String expected = "III";

        //act
        var result = romanNumeralsRestController.toRoman(numero);
        System.out.println(numero);
        //assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void toRomanV(){
        // arrange
        Integer numero = 5;
        String expected = "V";

        //act
        var result = romanNumeralsRestController.toRoman(numero);
        System.out.println(numero);
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void toRomanVII(){
        // arrange
        Integer numero = 7;
        String expected = "VII";

        //act
        var result = romanNumeralsRestController.toRoman(numero);
        System.out.println(numero);
        //assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void toRomanX(){
        // arrange
        Integer numero = 10;
        String expected = "X";

        //act
        var result = romanNumeralsRestController.toRoman(numero);
        System.out.println(numero);
        //assert
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void toRomanL(){
        // arrange
        Integer numero = 50;
        String expected = "L";

        //act
        var result = romanNumeralsRestController.toRoman(numero);
        System.out.println(numero);
        //assert
        Assertions.assertEquals(expected, result);
    }

}
