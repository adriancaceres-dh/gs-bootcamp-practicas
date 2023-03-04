package metroscuadrados.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter

public class HabitacionDTO  {
    private String nombre;
    private double largo;
    private double ancho;

    public double cantidadM2() {
        return this.ancho * this.largo;
    }
}
