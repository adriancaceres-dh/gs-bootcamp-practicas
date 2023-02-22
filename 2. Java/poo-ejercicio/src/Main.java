public class Main {
    public static void main(String[] args) {
    // Ejercicio 3 y 4
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Lucas", 28, "1294871");
        Persona persona3 = new Persona("Laura", 10, "9814282", 75, 1.75);

    // Ejercicio 4- Sí, es posible solo realizandolo de esta manera. Para poder realizarlo igual que arriba es necesario
        //  crear el metodo constructor con los datos que querramos pasar.
        Persona persona4 = new Persona();
        persona4.nombre = "Gian";
        persona4.edad = 25;


        System.out.println(persona2);
        System.out.println("________________________________________________________________________");
        String reference = "sobrepeso";
        if (persona3.calcularImc() == -1){
            reference = "bajo peso";
        } else if (persona3.calcularImc() == 0){
            reference = "peso saludable";
        }
        System.out.println("Usted se encuentra con " + reference);

        System.out.println("________________________________________________________________________");

        String esMayor= "es menor de edad";

        if(persona3.esMayorDeEdad()){
            esMayor= "es mayor de edad";
        }
        System.out.println("Usted " + esMayor);
        System.out.println("________________________________________________________________________");
    }

}