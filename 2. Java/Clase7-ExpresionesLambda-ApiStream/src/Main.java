import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Vehiculo("Ford", "Fiesta", 1000));
        listaVehiculos.add(new Vehiculo("Ford", "Focus", 1200));
        listaVehiculos.add(new Vehiculo("Ford", "Explorer", 2500));
        listaVehiculos.add(new Vehiculo("Fiat", "Uno", 500));
        listaVehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
        listaVehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
        listaVehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        listaVehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
        listaVehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
        listaVehiculos.add(new Vehiculo("Toyota", "Fortuner", 3000));
        listaVehiculos.add(new Vehiculo("Renault", "Logal", 950));

        Garage garage = new Garage(1,listaVehiculos);

        listaVehiculos.sort(Comparator.comparingDouble(Vehiculo::getCosto));
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + ": $" + vehiculo.getCosto());
        }

        System.out.println("\n");
       // ordenado marca y precio:
        garage.getListaVehiculos().stream().sorted(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getCosto))
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getCosto()));
        System.out.println("\n");

        //EJERCICIO 5

        //precio menor a 1000:
        garage.getListaVehiculos().stream().filter(auto -> auto.getCosto() < 1000)
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getCosto()));
        System.out.println("\n");

        //precio mayor o igual a 1000:
        garage.getListaVehiculos().stream().filter(auto -> auto.getCosto() >= 1000)
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getCosto()));
        System.out.println("\n");

        //promedio:
        //mapToDouble convierte la lista de autos en una lista de precios.
        //orElse es para indicar un valor por defecto si esta vacío el array de precios y no me obligue a usar OptionalDouble como tipo de dato.
        double promedioPrecios = garage.getListaVehiculos().stream().mapToDouble(auto -> auto.getCosto()).average().orElse(0.0);
        System.out.println("El promedio de precios es: $" + promedioPrecios);
        System.out.println("\n");


    }
}
