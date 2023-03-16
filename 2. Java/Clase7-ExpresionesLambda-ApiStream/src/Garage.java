import java.util.ArrayList;
import java.util.List;

public class Garage {

    private int id;
    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Garage() {
    }

    public Garage(int id, List<Vehiculo> listaVehiculos) {
        this.id = id;
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", listaVehiculos=" + listaVehiculos +
                '}';
    }
}
