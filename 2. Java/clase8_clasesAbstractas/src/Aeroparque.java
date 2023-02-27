import java.util.ArrayList;
import java.util.List;

public class Aeroparque {

    private List<Aeronave> aeronaves = new ArrayList<>();

    public void administrarAeronaves(Aeronave aeronave){
        aeronaves.add(aeronave);
    }

    public void despeganNaves(){
        for(Aeronave aeronave : aeronaves){
            aeronave.getBandera();
        }
    }

}