public class Nave implements Calculos {
    private String nombre;
    private double x;
    private double y;
    private double puntuacion = 0.0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Nave() {
    }

    public Nave(String nombre, double x, double y, double puntuacion) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "nombre='" + nombre + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", puntuacion=" + puntuacion +
                '}';
    }

}
