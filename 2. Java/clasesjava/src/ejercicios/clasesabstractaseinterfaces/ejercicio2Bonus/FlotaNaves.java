package ejercicios.clasesabstractaseinterfaces.ejercicio2Bonus;

import java.util.ArrayList;
import java.util.List;

public class FlotaNaves {
    //atributos
    List<Nave> flotaNaves =new ArrayList<>();

    public FlotaNaves() {
    }

    //constructor
    public FlotaNaves(List<Nave> flotaNaves) {
        this.flotaNaves = flotaNaves;
    }

    //getters and setters
    public List<Nave> getFlotaNaves() {
        return flotaNaves;
    }

    public void setFlotaNaves(List<Nave> flotaNaves) {
        this.flotaNaves = flotaNaves;
    }

    //override
    @Override
    public String toString() {
        return "FlotaNaves{" +
                "flotaNaves=" + flotaNaves +
                '}';
    }
}
