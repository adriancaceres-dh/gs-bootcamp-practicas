package POO;

public class EjercicioPlaygroundPOO1conJava {

    public static void main(String[] args) {

        //EJERCICIO 1 :
        PersonaPooEjercicios personaPooEjercicios = new PersonaPooEjercicios("valentina", 26, "94662619");
        PersonaPooEjercicios personaPooEjercicios1 = new PersonaPooEjercicios("Franco", 29, "364897");
        PersonaPooEjercicios personaPooEjercicios2 = new PersonaPooEjercicios("Pamela", 30, "364898");

        PersonaPooEjercicios personaPooEjercicios3 = new PersonaPooEjercicios();
        personaPooEjercicios3.nombre = "Manuel";
        personaPooEjercicios3.edad = 33;
        personaPooEjercicios3.peso = 67.8;
        personaPooEjercicios3.altura = 1.64;

        PersonaPooEjercicios personaPooEjercicios4 = new PersonaPooEjercicios();
        personaPooEjercicios4.nombre = "Sebastian";
        personaPooEjercicios4.edad = 17;
        personaPooEjercicios4.peso = 200;
        personaPooEjercicios4.altura = 1.54;

        GrupoPersonas grupoPersonas = new GrupoPersonas();
        grupoPersonas.agregarPersona(personaPooEjercicios);
        grupoPersonas.agregarPersona(personaPooEjercicios1);
        grupoPersonas.agregarPersona(personaPooEjercicios2);
        grupoPersonas.agregarPersona(personaPooEjercicios3);
        grupoPersonas.agregarPersona(personaPooEjercicios4);


        int imc = personaPooEjercicios4.calcularIMC();
        boolean esMayorDeEdad = personaPooEjercicios4.esMayorDeEdad();

        System.out.println(grupoPersonas.listarPersonas());
        System.out.println("La persona " + personaPooEjercicios4.nombre + " su imc es " + imc);
        System.out.println("Es mayor de edad? " + esMayorDeEdad);
    }
}
