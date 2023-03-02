package ejercicios.collections.SaveTheRopaSA;

public class Prenda {
     String marca;
     String modelo;

     //generamos el constructor para poder crear nuevas prendas con los parametros aclarados
    public Prenda(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
