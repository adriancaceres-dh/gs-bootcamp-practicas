import java.util.ArrayList;
import java.util.List;

public class Garaje {

    private int id;
    private List<Vehiculos> vehiculos;

    public Garaje() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Garaje(int id, List<Vehiculos> vehiculos) {
        this.id = id;
        this.vehiculos = vehiculos;


    }
}
