package Clase3.sp.obtenerDiploma.models;


import Clase3.sp.obtenerDiploma.dto.MateriaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {
    private String nombre;
    private List<Materia> materias=new ArrayList<>();


}
