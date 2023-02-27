import java.util.ArrayList;
import java.util.List;

public class FlotaNaves {
    List<Nave> naves = new ArrayList<>();

    public List<Nave> getNaves() {
        return naves;
    }

    public void setNaves(List<Nave> naves) {
        this.naves = naves;
    }

    public FlotaNaves() {
    }

    public FlotaNaves(List<Nave> naves) {
        this.naves = naves;
    }

    @Override
    public String toString() {
        return "FlotaNaves{" +
                "naves=" + naves +
                '}';
    }
}
