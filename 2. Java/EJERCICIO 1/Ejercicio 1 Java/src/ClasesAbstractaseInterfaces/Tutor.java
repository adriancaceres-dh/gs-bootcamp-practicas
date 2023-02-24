package ClasesAbstractaseInterfaces;

 public class Tutor extends Estudiante implements EquipoDocente{

     @Override // usa el metodo
     public void enseniar() {
         System.out.println("El tutor es un estudiantes que enseña");
     }



     public Tutor(String nombre, String apellido, int edad, int codigoEstudiante) {
         super(nombre, apellido, edad, codigoEstudiante);
     }
 }
