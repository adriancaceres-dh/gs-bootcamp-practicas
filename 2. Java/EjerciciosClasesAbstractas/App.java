import entidades.Aeroparque;
import entidades.AvionCarga;
import entidades.AvionPasajeros;

public class App {
    public static void main(String[] args) {
        System.out.println();


        Aeroparque aeroparque = new Aeroparque();
        aeroparque.administrarAeronaves(new AvionCarga("Argentina", 3, "5T"));
        aeroparque.administrarAeronaves(new AvionPasajeros("Chile",5,"10"));
    }
}
