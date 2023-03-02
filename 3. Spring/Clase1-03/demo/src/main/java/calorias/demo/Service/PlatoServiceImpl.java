package calorias.demo.Service;

import calorias.demo.DTO.ComidaDto;
import calorias.demo.DTO.IngredienteDto;
import org.springframework.stereotype.Service;

@Service

public class PlatoServiceImpl implements PlatoService{
    @Override
    public String caloriasTotales(ComidaDto c) {
        double calorias = 0;

        for (IngredienteDto ingredienteDto: c.getIngrediente()) {
            calorias += ingredienteDto.getCalorias();
        }
        return "Cantidad total de calorias " + calorias;
    }

    @Override
    public String caloriasIngrediente(ComidaDto c) {
        String ingredientes = "La comida " + c.getNombre() + ":\n";
        for (IngredienteDto ingredienteDto : c.getIngrediente()) {
            ingredientes += "El ingrediente " + ingredienteDto.getNombre() + " tiene " +  ingredienteDto.getCalorias() + " calorias. \n";
        }
        return ingredientes;
    }

    @Override
    public String MayorCalorias(ComidaDto c) {

        return null;
    }
}
