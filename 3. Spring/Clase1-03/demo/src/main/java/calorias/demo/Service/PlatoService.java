package calorias.demo.Service;

import calorias.demo.DTO.ComidaDto;
import org.springframework.stereotype.Service;

@Service
public interface PlatoService  {

    public String caloriasTotales(ComidaDto c);

    public String caloriasIngrediente(ComidaDto c);

    public String MayorCalorias(ComidaDto c);


}
