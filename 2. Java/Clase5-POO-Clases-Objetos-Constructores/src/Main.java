public class Main {

    //Ejercicio 3 : Creá una clase nueva llamada Main, donde declares un método main. Esto nos permitirá ejecutar nuestra aplicación.
    public static void main(String[] args) {

        // Ejercicio 4:
        // crear un objeto de tipo Persona por cada constructor que hayamos definido en la clase,
        // crear otro objeto de tipo persona y vamos a construirlo pasando solamente un valor para el nombre
        // y otro para la edad en el constructor.

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Gisel", 44, "27039110");
        Persona persona3 = new Persona("Ilan", 6, "35567344", 1.40, 35);

        System.out.println(persona2);
        System.out.println(persona3);

        //EJERCICIO 6: mostrar los datos y los mensajes quedan a tu criterio,
        // pero debe ser legible y descriptivo para quien ve la salida del programa.

        System.out.println("Datos de la persona: ");
        System.out.printf("\n ");

        System.out.println("Nombre: " + persona3.nombre);
        System.out.println("Edad: " + persona3.edad + " años");
        System.out.println("DNI: " + persona3.DNI);
        System.out.println("Peso: " + persona3.peso + " Kg");
        System.out.println("Altura: " + persona3.altura + " Mts");


        double IndiceMasaCorporal = persona3.calcularIMC();
        System.out.printf("\n");

        if(IndiceMasaCorporal == -1){
            System.out.println(persona3.nombre + " tiene Bajo Peso.");
        } else if (IndiceMasaCorporal == 0) {
            System.out.println(persona3.nombre + " tiene Peso Saludable.");
        }else{
            System.out.println(persona3.nombre + " tiene Sobrepeso.");
        }


        boolean mayor = persona3.esMayorDeEdad();

        if(mayor){
            System.out.println(persona3.nombre + " tiene " + persona3.edad + ", es mayor de edad");
        }else{
            System.out.println(persona3.nombre + " tiene " + persona3.edad + " es menor de edad");
        }
    }
}