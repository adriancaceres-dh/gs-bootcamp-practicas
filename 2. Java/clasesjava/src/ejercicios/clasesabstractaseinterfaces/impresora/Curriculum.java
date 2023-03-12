package ejercicios.clasesabstractaseinterfaces.impresora;

import java.util.List;

public class Curriculum implements Imprimir{

    //atributos
   private String nombre;
   private String apellido;
   private Integer edad;
   private Integer DNI;
   private List<String> habilidades;

    //metodo vacio y sin parametros

    public Curriculum(){

   }

   //constructor
    public Curriculum(String nombre, String apellido, Integer edad, Integer DNI, List<String> habilidades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.habilidades = habilidades;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", habilidades=" + habilidades +
                '}';
    }

    //metodo de la interface, como lo implementa es obligatorio usarla en la clase
    @Override
    public void Imprimir(){
        System.out.println("Imprimir el CV");
    }
}
