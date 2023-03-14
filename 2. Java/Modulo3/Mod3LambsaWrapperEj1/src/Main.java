import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> vehiculosGarage = new ArrayList<>();
        vehiculosGarage.add(new Vehiculo("Ford", "Fiesta", 1000.0));
        vehiculosGarage.add(new Vehiculo("Ford", "Focus", 1200.0));
        vehiculosGarage.add(new Vehiculo("Ford", "Explorer", 2500.0));
        vehiculosGarage.add(new Vehiculo("Fiat", "Uno", 500.0));
        vehiculosGarage.add(new Vehiculo("Fiat", "Cronos", 1000.0));
        vehiculosGarage.add(new Vehiculo("Fiat", "Torino", 1250.0));
        vehiculosGarage.add(new Vehiculo("Chevrolet", "Aveo", 1250.0));
        vehiculosGarage.add(new Vehiculo("Chevrolet", "Spin", 2500.0));
        vehiculosGarage.add(new Vehiculo("Toyota", "Corolla", 1200.0));
        vehiculosGarage.add(new Vehiculo("Toyota", "Fortuner", 3000.0));
        vehiculosGarage.add(new Vehiculo("Renault", "Logal", 950.0));

        Garage garage = new Garage(1,vehiculosGarage);

        /*vehiculosGarage.sort(Comparator.comparingDouble(Vehiculo::getCosto));
        for (Vehiculo vehiculo : vehiculosGarage) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + ": $" + vehiculo.getCosto());
        }*/

        //PARA ORDENAR DE MAYOR A MENOR PRECIO
        System.out.println("-----Ordenados de Mayor a Menor Precio-----");
        garage.getListaVehiculos().stream().sorted((auto1,auto2) -> Double.compare(auto2.getCosto(),auto1.getCosto()))
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getCosto()));
        System.out.println("-------------------------------------------\n");

        //PARA ORDENAR DE MENOR A MAYOR PRECIO
        System.out.println("-----Ordenados de Menor a Mayor Precio-----");
        garage.getListaVehiculos().stream().sorted((auto1,auto2) -> Double.compare(auto1.getCosto(),auto2.getCosto()))
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getCosto()));
        System.out.println("-------------------------------------------\n");

        //ORDENAR POR MARCA Y PRECIO
        System.out.println("-------Ordenados por Marca y Precio--------");
        garage.getListaVehiculos().stream().sorted(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getCosto))
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getCosto()));
        System.out.println("-------------------------------------------\n");


        //EJERCICIO 5
        System.out.println("--------------------------------------------");
        System.out.println("----------Auto precio menor 1000------------");
        System.out.println("--------------------------------------------");
        garage.getListaVehiculos().stream().filter(auto -> auto.getCosto() < 1000)
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getCosto()));
        System.out.println("------------------------------------------\n");

        System.out.println("--------------------------------------------");
        System.out.println("-----Auto precio mayor o igual a 1000-------");
        System.out.println("--------------------------------------------");
        garage.getListaVehiculos().stream().filter(auto -> auto.getCosto() >= 1000)
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getCosto()));
        System.out.println("------------------------------------------\n");

        System.out.println("--------------------------------------------");
        System.out.println("-------------Promedio precios---------------");
        System.out.println("--------------------------------------------");
        //mapToDouble convierte la lista de autos en una lista de precios.
        //orElse es para indicar un valor por defecto si esta vacio el array de precios y no me obligue a usar OptionalDouble como tipo de dato.
        double promedioPrecios = garage.getListaVehiculos().stream().mapToDouble(auto -> auto.getCosto()).average().orElse(0.0);
        System.out.println("El promedio de precios es: $" + promedioPrecios);
        System.out.println("------------------------------------------\n");


    }
}