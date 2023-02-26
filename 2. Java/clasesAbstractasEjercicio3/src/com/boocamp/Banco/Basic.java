package com.boocamp.Banco;

public class Basic extends Cliente implements Transaciones {

    public void pagosDeServicio(){
        System.out.println("pago se servicio");
    }


    public void consultaDeSaldo() {
        System.out.println("consulta de saldo");
    }


    public void retiroDeEfectivo() {
        System.out.println("retiro de efectivo");
    }

    @Override
    public void transaccionesOk() {
        System.out.println("transaccion ok");
    }

    @Override
    public void transacionesNoOk() {
        System.out.println("transaccione no ok");
    }
}
