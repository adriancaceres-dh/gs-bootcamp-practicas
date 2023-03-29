public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Lucio", 26, "36345677");
        Persona persona3 = new Persona("Alejandro", 25, "22026356",1.74,103.0);

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
    }
}