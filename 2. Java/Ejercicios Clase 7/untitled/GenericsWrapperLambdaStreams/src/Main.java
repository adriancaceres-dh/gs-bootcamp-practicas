import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehiculos> vehiculos = Arrays.asList(
        new Vehiculos("Ford", "Fiesta", 1000),
        new Vehiculos("Ford", "Focus", 1200),
        new Vehiculos("Ford", "Explorer", 2500),
        new Vehiculos("Fiat", "Uno", 500),
        new Vehiculos("Fiat", "Cronos", 1000),
        new Vehiculos("Fiat", "Torino", 1250),
        new Vehiculos("Chevrolet", "Aveo", 1250),
        new Vehiculos("Chevrolet", "Spin", 2500),
        new Vehiculos("Toyota", "Corlla", 1200),
        new Vehiculos("Toyota", "Fortuner", 3000),
        new Vehiculos("Renault", "Logan", 950));

        Garaje garaje = new Garaje(1, vehiculos);

        Collections.sort(garaje.getVehiculos();
    }
}
