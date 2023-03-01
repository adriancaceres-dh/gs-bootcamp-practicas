package ClasesAbstractaseInterfaces;

import java.util.ArrayList;
import java.util.List;

public class AeroParque {

    private List<AeroNave> aeronaves = new ArrayList<>();

    public void administrarAeronaves(AeroNave aeronave) {
        aeronaves.add(aeronave);
    }

    public void despeganNaves() {
        for (AeroNave aeronave: aeronaves) {
            aeronave.despegar();
        }
    }

    public void administrarAeronaves(AvionCarga arg) {
    }
}