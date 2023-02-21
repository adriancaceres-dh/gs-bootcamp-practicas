public class Main {
    public static void main(String[] args) {
        //ACTIVIDAD REALIZADA ANTES DE LA CLASE
        //EJERCICIO 4
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Luciano", 31, "36365939");
        Persona persona3 = new Persona("Marcela", 17, "22026356",1.71,60.0);

        //Persona persona4 = new Persona("Hugo",90.0);
        //No permite crear una persona solo con dato nombre y peso ya que dicha clase no fue definida.

        //EJERCICIO 6
        System.out.println("-------------------------------------------------------");
        System.out.println("Datos de la persona: ");
        System.out.println("Nombre: " + persona3.nombre + ".");
        System.out.println("Edad: " + persona3.edad + " años.");
        System.out.println("DNI: " + persona3.DNI + ".");
        System.out.println("Peso: " + persona3.peso + " Kg.");
        System.out.println("Altura: " + persona3.altura + " Mts.");
        System.out.println("-------------------------------------------------------");

        double masaCorporal = persona3.calcularIMC();

        if(masaCorporal == -1){
            System.out.println(persona3.nombre + " tiene un nivel de peso: Bajo Peso.");
        } else if (masaCorporal == 0) {
            System.out.println(persona3.nombre + " tiene un nivel de peso: Peso Saludable.");
        }else{
            System.out.println(persona3.nombre + " tiene un nivel de peso: Sobrepeso.");
        }

        boolean esMayor = persona3.esMayordeEdad();

        if(esMayor){
            System.out.println(persona3.nombre + " es mayor de edad. Tiene " + persona3.edad + " años.");
        }else{
            System.out.println(persona3.nombre + " es menor de edad. Tiene " + persona3.edad + " años.");
        }

        System.out.println("-------------------------------------------------------");
    }
}