package com.bootcamp.varios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

    // Ejercicio 4

    //instanciamos un objeto
        Scanner scanner = new Scanner(System.in);


    //usamos metodos del objeto
        System.out.println("Ingrese monto bruto");
        double montoBruto = scanner.nextDouble();
        double impuesto1 = montoBruto * 2.45 / 100;
        double impuesto2 = montoBruto * 15 / 100;
        double impuesto3 = montoBruto * 3 / 100;
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        String montoNetoPremioDecimal = formatoDecimal.format(montoBruto-impuesto1-impuesto2-impuesto3);
        System.out.println("total neto" + montoNetoPremioDecimal );


        System.out.println("El monto neto a cobrar es " + montoNetoPremioDecimal);
    }

}
