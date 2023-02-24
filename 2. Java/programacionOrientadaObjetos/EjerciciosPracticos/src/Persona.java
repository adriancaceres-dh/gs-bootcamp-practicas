public class Persona {
    String nombre;
    String DNI;
    int edad;
    double peso;
    double altura;

    public Persona () {}

    public Persona (String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;

    }

    public Persona(String nombre, String DNI, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = peso / altura * altura; //
        if(imc < 20) {
            return -1;
        } else if (imc <= 25 ) {
            return 0;
        } else {
            return 1;
        }

    }

    public boolean esMayorDeEdad() {return edad > 18;};

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}




/*
public class Persona {
    String nombre;
    int edad;
    String DNI;
    double peso;
    double altura;

}
    Persona persona = new Persona();
    Persona persona =public Persona(String nombre, int edad, String DNI){
    this.nombre = nombre;
    this.edad = edad;
    this.DNI = DNI;

    }
}
*/




