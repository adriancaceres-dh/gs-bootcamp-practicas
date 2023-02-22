public class Persona {
    //EJERCICIO 1
    String nombre;
    int edad;
    String DNI;
    double altura;
    double peso;

    //EJERCICIO 2
    public Persona(){

    }

    public Persona(String nombre, int edad, String DNI){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    public Persona(String nombre, int edad, String DNI, double altura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.altura = altura;
        this.peso = peso;
    }//e
    //EJERCICIO 5
    public double calcularIMC(){
        double IMC = peso / (Math.pow(altura,2));

        if(IMC < 20){
            return -1;
        }else if(IMC >= 20 && IMC <= 25){
            return 0;
        }else{
            return 1;
        }
    }
    public boolean esMayordeEdad(){
        if(edad >= 18){
            return true;
        }else{
            return false;
        }
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