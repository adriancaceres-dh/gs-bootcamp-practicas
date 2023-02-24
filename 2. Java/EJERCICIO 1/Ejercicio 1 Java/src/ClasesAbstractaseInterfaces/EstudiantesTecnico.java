package ClasesAbstractaseInterfaces;

 public class EstudiantesTecnico extends Estudiante implements EquipoTecnico{

     @Override
     public void darSoporteTecnico() {

     }

     @Override
     public void colaborar() {

     }

     public EstudiantesTecnico(String nombre, String apellido, int edad, int codigoEstudiante) {
         super(nombre, apellido, edad, codigoEstudiante);
     }
 }
