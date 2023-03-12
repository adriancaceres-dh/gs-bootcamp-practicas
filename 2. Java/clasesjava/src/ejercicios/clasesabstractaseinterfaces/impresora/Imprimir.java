package ejercicios.clasesabstractaseinterfaces.impresora;

public interface Imprimir {

    //metodo para imprimir documentos
    public static void imprimible(Imprimir documento){
        System.out.println(documento);

    }

    public void Imprimir();
}
