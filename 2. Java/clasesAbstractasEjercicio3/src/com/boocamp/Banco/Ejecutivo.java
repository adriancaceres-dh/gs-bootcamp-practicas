package com.boocamp.Banco;

public class Ejecutivo extends Cliente implements Transaciones{

     public void Deposito(){
         System.out.println("Realizan Déposito");
     }

     public void Transferencia(){
         System.out.println("Transferencia");
     }



    @Override
    public void transaccionesOk() {
        System.out.println("Transacciones Ok");
    }

    @Override
    public void transacionesNoOk() {
        System.out.println("Transacciones No Ok");
    }
}
