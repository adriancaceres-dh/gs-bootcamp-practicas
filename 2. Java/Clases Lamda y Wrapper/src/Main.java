import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Ford", "Fiesta",1000);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Focus",1450);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Explorer",2000);
        Vehiculo vehiculo4 = new Vehiculo("Fiat", "Fiesta",500);
        Vehiculo vehiculo5 = new Vehiculo("Fiat", "Cronos",950);
        Vehiculo vehiculo6 = new Vehiculo("Fiat", "Torino",3000);
        Vehiculo vehiculo7 = new Vehiculo("Chevrolet", "Fiesta",100);
        Vehiculo vehiculo8 = new Vehiculo("Toyota", "Fiesta",5500);
        Vehiculo vehiculo9 = new Vehiculo("Ford", "Fortuner",3250);
        Vehiculo vehiculo10 = new Vehiculo("Ford", "Olgan",4000);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);
        vehiculos.add(vehiculo5);
        vehiculos.add(vehiculo6);
        vehiculos.add(vehiculo7);
        vehiculos.add(vehiculo8);
        vehiculos.add(vehiculo9);
        vehiculos.add(vehiculo10);

        Collections.sort(vehiculos);



        System.out.println(vehiculos);

    }
}