import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    int contador = 10;
    Map<Integer, List<Prenda>> prendas = new HashMap<>();
    public GuardaRopa() {
        this.contador = 0;
        this.prendas = new HashMap<>();

    }
}
