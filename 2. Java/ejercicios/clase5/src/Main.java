public class Main {
    public static void main(String[] args) {

        Persona mateo = new Persona();
        mateo.nombre = "Mateo";
        mateo.edad = 27;
        mateo.dni = "38123123";
        mateo.peso = 70;
        mateo.altura = 1.80;


        Persona pedro = new Persona("Pedro",25,"250023412");
        pedro.peso = 80;
        pedro.altura = 1.70;


        Persona maria = new Persona("Maria", 30, "36321454", 60, 1.65);

        System.out.println("---------------------------------------");
        System.out.println("Nombre: " + maria.nombre);
        System.out.println("Edad: " + maria.edad);
        System.out.println("Peso: " + maria.peso + "Kg");
        System.out.println("Altura: " + maria.altura + "Mts");
        System.out.println("---------------------------------------");
        switch (maria.calcularIMC()){
            case 1:
                System.out.println("IMC: Mayor a 25. SOBREPESO");
                break;
            case -1:
                System.out.println("IMC: Por debajo de 20. BAJO PESO");
                break;
            case 0:
                System.out.println("IMC: Entre 20 y 25. PESO SALUDABLE");
        }
        System.out.println("---------------------------------------");
    }
}
