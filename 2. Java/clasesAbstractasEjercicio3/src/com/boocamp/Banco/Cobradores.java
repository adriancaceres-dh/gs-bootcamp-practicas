package com.boocamp.Banco;

public class Cobradores extends Cliente implements Transaciones {

    public void consultaDeSaldo() {
        System.out.println("Consulta de datos");
    }


    public void retiroDeEfectivo() {
        System.out.println("Retiro de efectivo");
    }

    @Override
    public void transaccionesOk() {
        System.out.println("Transaccion Ok");
    }

    @Override
    public void transacionesNoOk() {
        System.out.println("Transacion No Ok");
    }
}
