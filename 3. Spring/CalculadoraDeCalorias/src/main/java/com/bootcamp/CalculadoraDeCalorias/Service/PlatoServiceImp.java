package com.bootcamp.CalculadoraDeCalorias.Service;

import com.bootcamp.CalculadoraDeCalorias.Dto.ComidaDto;
import com.bootcamp.CalculadoraDeCalorias.Dto.IngredientesDto;
import org.springframework.stereotype.Service;

@Service
public class PlatoServiceImp implements PlatoService{
    @Override
    public String caloriasTotales(ComidaDto c) {
       double calorias=0;
       for (IngredientesDto ingredientesDto: c.getIngredientes()){
          calorias += ingredientesDto.getCalorias();
       }

        return "Cantidad total de calorias " ;
    }

    @Override
    public String caloriasIngrediente(ComidaDto c) {
        String ingredientes = "Las comida " + c.getNombre() + ":\n";
        for (IngredientesDto ingredientesDto : c.getIngredientes()){
           ingredientes+= "El ingrediente " + ingredientesDto.getNombre() +
                   "Tiene  " + ingredientesDto.getCalorias() +  " calorias. \n";
        }
        return null;
    }

    @Override
    public String mayorCalorias(ComidaDto c) {
        return null;
    }
}
