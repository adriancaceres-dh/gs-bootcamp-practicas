public class Persona {
    String nombre;
    int edad;
    String DNI;
    double  altura;
    double peso;

    //Contructor sin parámetros
    public Persona(){}

    //Contructor con parámetros nombre, edad, dni
    public Persona(String nombre, int edad, String DNI){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    //Constructor con todos los datos en parámetros
    public Persona(String nombre, int edad, String DNI, double altura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC(){
        double IMC = peso / (Math.pow(altura, 2));
        if (IMC < 20){
            return -1;
        } else if(IMC >= 20 && IMC <= 25){
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return edad > 18;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
