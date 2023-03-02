import java.util.ArrayList;
import java.util.List;

public class Flota implements IParticipante {

    public List<Nave> nave = new ArrayList<>();

    public int puntos;

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
        return this.puntos;
    }

    public Flota() {
    }

    public Flota(List<Nave> naves) {
        this.naves = naves;
    }

    public List<Nave> getNave() {
        return naves;
    }

    public void SetNaves(List<Nave> naves) {
        this.naves = naves;
    }

    @Override
    public String toString() {
        return "Flota{" +
                "naves=" + naves +
                '}';
    }

    @Override
    public double distancia(int x, int y) {
        double promedio = 0.0;
        double suma = 0;
        for (Nave nave : naves) {
            suma += nave.distancia(x, y);
        }
        promedio = suma / naves.size();
        return promedio;
    }
}

