package calorias.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComidaDto {

    private String nombre;

    private List<IngredienteDto> ingrediente = new ArrayList<>();
}
