package com.example.IntroSpring.clase1_ejercicioCodigoMorse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DecodificarMorse {
    @GetMapping("/{codigoMorse}")
    public String decodificarPalabras(@PathVariable String codigoMorse){
        String[] palabras = codigoMorse.split("   ");

        List<String> letras = new ArrayList<>();
        for(int i = 0; i < palabras.length; i++){
            String[] letra = palabras[i].split(" ");
            for(int j = 0; j < letra.length; j++){
                letras.add(letra[j]);
            }
        }

        String palabrasCodificadas = "";

        for (String letra : letras) {
            switch (letra){
                case ".-.-.-":
                    palabrasCodificadas += ".";
                    break;
                case "-.-.--":
                    palabrasCodificadas += "!";
                    break;
                case "···−−−···":
                    palabrasCodificadas += "SOS";
                    break;
                case ".-":
                    palabrasCodificadas += "A";
                    break;
                case "-...":
                    palabrasCodificadas += "B";
                    break;
                case "-.-.":
                    palabrasCodificadas += "C";
                    break;
                case "-..":
                    palabrasCodificadas += "D";
                    break;
                case ".":
                    palabrasCodificadas += "E";
                    break;
                case "..-.":
                    palabrasCodificadas += "F";
                    break;
                case "--.":
                    palabrasCodificadas += "G";
                    break;
                case "....":
                    palabrasCodificadas += "H";
                    break;
                case "..":
                    palabrasCodificadas += "I";
                    break;
                case ".---":
                    palabrasCodificadas += "J";
                    break;
                case "-.-":
                    palabrasCodificadas += "K";
                    break;
                case ".-..":
                    palabrasCodificadas += "L";
                    break;
                case "--":
                    palabrasCodificadas += "M";
                    break;
                case "-.":
                    palabrasCodificadas += "N";
                    break;
                case "---":
                    palabrasCodificadas += "O";
                    break;
                case ".--.":
                    palabrasCodificadas += "P";
                    break;
                case "--.-":
                    palabrasCodificadas += "Q";
                    break;
                case ".-.":
                    palabrasCodificadas += "R";
                    break;
                case "...":
                    palabrasCodificadas += "S";
                    break;
                case "-":
                    palabrasCodificadas += "T";
                    break;
                case "..-":
                    palabrasCodificadas += "U";
                    break;
                case "...-":
                    palabrasCodificadas += "V";
                    break;
                case ".--":
                    palabrasCodificadas += "W";
                    break;
                case "-..-":
                    palabrasCodificadas += "X";
                    break;
                case "-.--":
                    palabrasCodificadas += "Y";
                    break;
                case "--..":
                    palabrasCodificadas += "Z";
                    break;
                case ".----":
                    palabrasCodificadas += "1";
                    break;
                case "..---":
                    palabrasCodificadas += "2";
                    break;
                case "...--":
                    palabrasCodificadas += "3";
                    break;
                case "....-":
                    palabrasCodificadas += "4";
                    break;
                case ".....":
                    palabrasCodificadas += "5";
                    break;
                case "_....":
                    palabrasCodificadas += "6";
                    break;
                case "__...":
                    palabrasCodificadas += "7";
                    break;
                case "___..":
                    palabrasCodificadas += "8";
                    break;
                case "____.":
                    palabrasCodificadas += "9";
                    break;
                case "_____":
                    palabrasCodificadas += "0";
                    break;
                default:
                    break;
            }
        }
        return palabrasCodificadas;

        }
    }




