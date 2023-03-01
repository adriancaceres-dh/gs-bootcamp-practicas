package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@Data
@AllArgsConstructor

public class AlumnoDto {
    private String nombre;
    private List<AsignaturaDto> asignaturas = new ArrayList<>();

}
