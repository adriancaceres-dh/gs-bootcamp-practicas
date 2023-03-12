package ejercicios.lambdayclaseswrapper;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    //atributos
    private Integer id;
    private List<Vehículo> vehículos = new ArrayList<>();

    //constructor
    public Garage(Integer id, List<Vehículo> vehículos) {
        this.id = id;
        this.vehículos = vehículos;
    }

    //getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Vehículo> getVehículos() {
        return vehículos;
    }

    public void setVehículos(List<Vehículo> vehículos) {
        this.vehículos = vehículos;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", vehículos=" + vehículos +
                '}';
    }
}
