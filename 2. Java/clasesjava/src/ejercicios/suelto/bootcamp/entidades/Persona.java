package ejercicios.suelto.bootcamp.entidades;

//como persona no se usa se declara abstracta (no se instancia en ningun momento)--> hay que usar estudiante o tutor
public abstract class Persona {
//molde para usar los mismos atributos en varias clases sin tener que tipear todo
    private String nombre;

    private String dni;
}
