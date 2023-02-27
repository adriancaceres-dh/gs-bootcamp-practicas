package ejercicios.excepcionesycu;

import java.lang.Math;
public class Calculos {

    public int numeroMayor(int num1, int num2){
        return Math.max(num1, num2);
    }

    public int numeroMenor (int numa, int numb){
        return Math.min(numa, numb);
    }

    public double potencia(double numero, int potencia){
        return Math.pow(numero, potencia);
    }

    public double coseno(int angulo){
        return Math.cos(angulo);
    }

    public double raiz(double num){
        return Math.sqrt(num);

    }

    public  int numeroAleatorio() {
        return (int) (Math.random() * 1000);
    }

}

