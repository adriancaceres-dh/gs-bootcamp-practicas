public class Main {
    //Ejercicio 3
    public static void main(String[] args) {

        //Ejercicio 4
        Persona persona = new Persona();
        Persona persona1 = new Persona("Salvador", 24, "40115878");
        Persona persona2 = new Persona("Salvador", 27, "40115878", 75, 1.80);

        //Ejercicio 6

        int imc = persona2.calcularIMC();

        if (imc == -1) {
            System.out.println("Bajo de peso");
        } else if (imc == 0) {
            System.out.println("Peso saludable");
        } else if (imc == 1) {
            System.out.println("Sobrepeso");
        }

        if(persona2.esMayorDeEdad()){
            System.out.println("Mayor de edad");
        }else System.out.println("Menor de edad");

        System.out.println("Datos personales: "+persona2.toString());
    }
}
