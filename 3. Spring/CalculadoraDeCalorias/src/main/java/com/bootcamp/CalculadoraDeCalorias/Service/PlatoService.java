package com.bootcamp.CalculadoraDeCalorias.Service;

import com.bootcamp.CalculadoraDeCalorias.Dto.ComidaDto;
import org.springframework.stereotype.Service;

@Service
public interface PlatoService {
    public String caloriasTotales(ComidaDto c);
    public String caloriasIngrediente(ComidaDto c);
    public String mayorCalorias(ComidaDto c);
}
