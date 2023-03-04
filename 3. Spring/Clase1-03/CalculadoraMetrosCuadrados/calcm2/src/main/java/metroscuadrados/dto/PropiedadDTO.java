package metroscuadrados.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropiedadDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones = new ArrayList<>();

    public double cantidadM2Total() {
        double areaTotal= 0.0;
        for (HabitacionDTO habitacion : this.habitaciones) {
            areaTotal += habitacion.cantidadM2();
        }
        return areaTotal;
    }
}
