public class Main {
    public static void main(String[] args) {
        //ACTIVIDAD REALIZADA ANTES DE LA CLASE
        //EJERCICIO 4
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Giancarlo", 22, "35123879");
        Persona persona3 = new Persona("Lucas", 17, "40785412", 1.80, 80.0);
        //EJERCICIO 6
        System.out.println(persona3);
        System.out.println("----------------------------------------------------------");
        String reference = "";
        if (persona3.calcularIMC() == -1){
            reference = "Bajo peso";
        } else if (persona3.calcularIMC()==0) {
            reference = "Peso saludable";
        }else {
            reference = "Sobrepeso";
        }
        System.out.println("Se encuentra con " + reference );
        System.out.println("----------------------------------------------------------");
        String esMayor = "Es menor de edad";
        if (persona3.esMayordeEdad()){
            esMayor = "Es mayor de edad";
        }
        System.out.println("Usted es " + esMayor);
        System.out.println("----------------------------------------------------------");

    }
}