package com.boocamp.Banco;


public class Main {

    public static void main(String[] args) {
        System.out.println("Ejecutivo");
        System.out.println("-----------------------------------------");
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.Transferencia();
        ejecutivo.Deposito();
        System.out.println("-----------------------------------------");

        System.out.println("Basic");
        System.out.println("-----------------------------------------");
        Basic basic = new Basic();
        basic.consultaDeSaldo();
        basic.pagosDeServicio();
        basic.retiroDeEfectivo();
        System.out.println("-----------------------------------------");


        System.out.println("Cobradores");
        System.out.println("-----------------------------------------");
        Cobradores cobradores = new Cobradores();
        cobradores.retiroDeEfectivo();
        cobradores.consultaDeSaldo();
        System.out.println("-----------------------------------------");
    }
}