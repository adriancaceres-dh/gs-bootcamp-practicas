
public class Nave implements IParticipante{
    private String nombre;
    private int x;
    private int y;
    private int puntos;

    public Nave() {}

    public Nave(String nombre, int x, int y, int puntos) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void acumularPuntos() {
        this.puntos++;
    }

    @Override
    public int obtenerPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "nombre='" + nombre + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", puntos=" + puntos +
                '}';
    }

    public double distancia(int x, int y) {
        return Math.sqrt(  Math.pow(this.x - x,2) + Math.pow(this.y-y,2) );
    }

}
