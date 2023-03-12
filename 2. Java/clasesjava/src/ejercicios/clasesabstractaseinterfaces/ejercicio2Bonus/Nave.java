package ejercicios.clasesabstractaseinterfaces.ejercicio2Bonus;

public abstract class Nave implements Calculos{
    //atributos

    String nombre;
    Double coordenadaX;
    Double coordenadaY;
    Double puntuacion = 0.00;

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(Double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public Double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(Double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public Double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Double puntuacion) {
        this.puntuacion = puntuacion;
    }

    //constructor
    public Nave(String nombre, Double coordenadaX, Double coordenadaY, Double puntuacion) {
        this.nombre = nombre;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.puntuacion = puntuacion;
    }

    //override --> to string
    @Override
    public String toString() {
        return "Nave{" +
                "nombre='" + nombre + '\'' +
                ", coordenadaX=" + coordenadaX +
                ", coordenadaY=" + coordenadaY +
                ", puntuacion=" + puntuacion +
                '}';
    }

    public Nave(){

    }

}
