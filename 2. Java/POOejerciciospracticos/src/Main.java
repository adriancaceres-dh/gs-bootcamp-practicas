public class Main {
    //Ejercicio 3
    public static void main(String[] args) {
    //Ejercicio 4
        Persona persona1 = new Persona();
        Persona persona2 = new Persona( "Marixa", 35, "35230626");
        Persona persona3 = new Persona( "Pepe", 28, "38258323",50, 1.73);
        //Persona persona4 = new Persona("Mica", 12);// No se puede resolver, dado que no esta
        //definida la clase//

        System.out.println(persona3);
        System.out.println("__");
        String reference = "sobrepeso";
        if (persona3.calcularIMC() == -1){
            reference = "bajo peso";
        } else if (persona3.calcularIMC() == 0){
            reference = "peso saludable";
        }
        System.out.println("Usted se encuentra con " + reference);

        System.out.println("__");

        String esMayor= "es menor de edad";

        if(persona3.esMayorDeEdad()){
            esMayor= "es mayor de edad";
        }
        System.out.println("Usted " + esMayor);
        System.out.println("__");
    }

    }



