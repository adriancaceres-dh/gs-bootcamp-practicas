public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Martin", "15", "40569812");
        Persona persona3 = new Persona("Manuel", "33", "34650711", 69.0, 1.74);
//        Persona persona4 = new Persona("Rosa", "60");

        System.out.println(persona3.calcularIMC());
        System.out.println(persona3.esMayorDeEdad());
//        persona3.calcularIMC();
//        persona3.esMayorDeEdad();
        System.out.println("Bienvenido " + persona3.nombre + " numero de documento " + persona3.dni);
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        if (persona3.esMayorDeEdad()) {
            System.out.println("Usted es mayor de edad y su edad es de" + persona3.edad +"años.");
        } else {
            System.out.println("Usted NO es mayor de edad, su edad es de " + persona3.edad +" años.");


        } if(persona3.calcularIMC()>25) {
        }}
}