package com.bootcamp.ejemplo.controller;

import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Ejercicios {

    @GetMapping()
    public String adios() {
        return "Home";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludo(@PathVariable String nombre) {
        return "Hola " + nombre;
    }

    @GetMapping("/saludar/{nombre}/{apellido}")
    public String saludo(@PathVariable String nombre, @PathVariable String apellido) {
        return "Hola " + nombre;
    }

    @GetMapping("/saludar/{nombre}/{apellido}/{edad}")
    public String saludo(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad) {
        return "Hello World! Tu nombre es: " + nombre + " y tu apellido es: " + apellido + " y tenes: " + edad;
    }

    @GetMapping("/numeroRomano/{numeroRomano}")
    public String decodificarNumeroRomano(@PathVariable String numeroRomano) {
        int resultado = 0;
        for (int i = 0; i < numeroRomano.length(); i++) {
            // obtener el valor del símbolo romano actual
            int valorActual = obtenerValorRomano(numeroRomano.charAt(i));
            // si el valor del símbolo siguiente es mayor, restar el valor actual
            if (i + 1 < numeroRomano.length() && obtenerValorRomano(numeroRomano.charAt(i + 1)) > valorActual) {
                resultado -= valorActual;
            } else {
                resultado += valorActual;
            }
        }
        return "El número romano " + numeroRomano + " equivale a " + resultado + " en decimal.";
    }

    private int obtenerValorRomano(char simbolo) {
        switch (simbolo) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Símbolo romano inválido: " + simbolo);
        }
    }


    @GetMapping("/aRomano/{numero}")
    public String convertirNumeroARomano(@PathVariable int numero) {
        if (numero < 1 || numero > 3999) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999.");
        }
        StringBuilder resultado = new StringBuilder();
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                resultado.append(simbolos[i]);
                numero -= valores[i];
            }
        }
        return "El número  equivale a " + resultado.toString() + " en romano.";
    }

    @GetMapping("/morse/{text}")
    public String convertToMorse(@PathVariable String text) {
        String morseCode = "   ";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            morseCode += toMorse(c) + " ";
        }
        return morseCode.trim() + " " + text;
    }

    private String toMorse(char c) {
        switch (Character.toUpperCase(c)) {
            case 'A':
                return ".-";
            case 'B':
                return "-...";
            case 'C':
                return "-.-.";
            case 'D':
                return "-..";
            case 'E':
                return ".";
            case 'F':
                return "..-.";
            case 'G':
                return "--.";
            case 'H':
                return "....";
            case 'I':
                return "..";
            case 'J':
                return ".---";
            case 'K':
                return "-.-";
            case 'L':
                return ".-..";
            case 'M':
                return "--";
            case 'N':
                return "-.";
            case 'O':
                return "---";
            case 'P':
                return ".--.";
            case 'Q':
                return "--.-";
            case 'R':
                return ".-.";
            case 'S':
                return "...";
            case 'T':
                return "-";
            case 'U':
                return "..-";
            case 'V':
                return "...-";
            case 'W':
                return ".--";
            case 'X':
                return "-..-";
            case 'Y':
                return "-.--";
            case 'Z':
                return "--..";
            case '0':
                return "-----";
            case '1':
                return ".----";
            case '2':
                return "..---";
            case '3':
                return "...--";
            case '4':
                return "....-";
            case '5':
                return ".....";
            case '6':
                return "-....";
            case '7':
                return "--...";
            case '8':
                return "---..";
            case '9':
                return "----.";
            case ' ':
                return "/";
            default:
                return "";
        }
    }


    }
