package ejercicios.lambdayclaseswrapper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[]  args){

        //instanciamos la lista de vehiculos y le agregamos los datos
        List<Vehículo> vehículosEnGarage = new ArrayList<>();
        vehículosEnGarage.add(new Vehículo("Fiesta", "Ford",1000.00));
        vehículosEnGarage.add(new Vehículo("Focus", "Ford",1200.00));
        vehículosEnGarage.add(new Vehículo("Explorer", "Ford",2500.00));
        vehículosEnGarage.add(new Vehículo("Uno", "Fiat",500.00));
        vehículosEnGarage.add(new Vehículo("Cronos", "Fiat",1000.00));
        vehículosEnGarage.add(new Vehículo("Torino", "Fiat",1250.00));
        vehículosEnGarage.add(new Vehículo("Aveo", "Chevrolet",1250.00));
        vehículosEnGarage.add(new Vehículo("Spin", "Chevrolet",2500.00));
        vehículosEnGarage.add(new Vehículo("Corolla", "Toyota",1200.00));
        vehículosEnGarage.add(new Vehículo("Fortuner", "Toyota",3000.00));
        vehículosEnGarage.add(new Vehículo("Logan", "Renault",950.00));

        //instanciamos a garage para crearlo con un id y la lista de vehiculos de arriba
        Garage garage = new Garage(1,vehículosEnGarage);

        //ordenamos precio de mayor a menor
        System.out.println("---------Ordenados de Mayor a Menor Precio----------------");
        //traemos la lista de vehiculos, con sorter lo ordenamos y con double.compare comparamos los precios indicando en que sentido los vamos a ordenar
        garage.getVehículos().stream().sorted((auto1, auto2)-> Double.compare(auto2.getPrecio(), auto1.getPrecio()))
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getPrecio()));
        System.out.println("----------------------------------------------------------");

        //ordenamos precio de menor a mayor
        System.out.println("---------Ordenados de Menor a Mayor Precio----------------");
        garage.getVehículos().stream().sorted((auto1, auto2)-> Double.compare(auto1.getPrecio(), auto2.getPrecio()))
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getPrecio()));
        System.out.println("----------------------------------------------------------");

        //ordenar por marca y precio
        System.out.println("-------Ordenados por Marca y Precio-----------------------");
        garage.getVehículos().stream().sorted(Comparator.comparing(Vehículo::getMarca).thenComparing(Vehículo::getPrecio))
        .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getPrecio()));
        System.out.println("----------------------------------------------------------");

        //ejercicio 5
        System.out.println("----------------------------------------------------------");
        System.out.println("---------Autos con precio menor a 1000--------------------");
        garage.getVehículos().stream().filter(auto -> auto.getPrecio() < 1000)
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getPrecio()));
        System.out.println("----------------------------------------------------------");
        System.out.println("---------Autos con precio mayor o igual a 1000------------");
        garage.getVehículos().stream().filter(auto -> auto.getPrecio() >= 1000)
                .forEach(auto -> System.out.println(auto.getMarca() + " " + auto.getModelo() + ": $" + auto.getPrecio()));
        System.out.println("-----------------------------------------------------------");
        System.out.println("---------------Promedio de precios-------------------------");
        //mapToDouble convierte la lista de autos en una lista de precios
        //orElse es para indicar un valor por defecto si esta vacio el array de precios y no me obligue a usar OptionalDouble como tipo de dato.
        double promedioPrecios = garage.getVehículos().stream().mapToDouble(auto -> auto.getPrecio()).average().orElse(0.0);
        System.out.println("El promedio de precios es: $" + promedioPrecios);
        System.out.println("-----------------------------------------------------------");
        //lista de marcas//
        System.out.println("-------------------Lista de Marcas-------------------------");
        garage.getVehículos().stream().forEach(auto -> System.out.println("Las marcas son: " + auto.getMarca()));
        System.out.println("-----------------------------------------------------------");




    }
}
