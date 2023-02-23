public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Martin", 20, "44305397");
        Persona persona3 = new Persona("Manuel", 23, "42608106", 1.70, 70.5);

        System.out.println(persona3);
        System.out.println("----------------------");

        //Persona persona4 = new Persona("Sergio", 80.5);
        //No podemos crear una persona solo con los datos nombre y peso ya que no esta definida esa clase.

        System.out.println("Datos de la persona");
        System.out.println("\nNombre: " + persona3.nombre);
        System.out.println("\nEdad: " + persona3.edad);
        System.out.println("\nDNI: " + persona3.DNI);
        System.out.println("\nAltura: " + persona3.altura + " mts");
        System.out.println("\nPeso: " + persona3.peso + " kg");
        System.out.println("\n----------------------------------------");

        double IMC = persona3.calcularIMC();

        if(IMC == -1){
            System.out.println(persona3.nombre + " presenta bajo peso");
        } else if (IMC == 0) {
            System.out.println(persona3.nombre + " presenta peso saludable");
        } else {
            System.out.println(persona3.nombre + " presenta sobrepeso");
        }

        System.out.println("\n----------------------------------------");

        if(persona3.esMayorDeEdad()){
            System.out.println(persona3.nombre + " es mayor de edad");
        } else {
            System.out.println(persona3.nombre + " NO es mayor de edad");
        }

    }
}