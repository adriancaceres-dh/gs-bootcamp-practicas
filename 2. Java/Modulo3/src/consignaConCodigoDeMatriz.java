// ¿ cual es el empleado con edad entre 30 y 40 ? ( con código )//

import java.util.Scanner;

public class consignaConCodigoDeMatriz {
       public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
           int[] legajo = {1,2,3,4};
           String[] empleados = {"Gomez","Fernandez","Rodriguez","Case"};
           int[] edad = {16,38,23,45};
           for (int i = 0; i < edad.length; i++){
               if(edad[i] >= 30 && edad[i] <= 40){
             System.out.println("El empleado entre 30 y 40 años es " + empleados[i]);
         }}}}
