package Controller;

import dto.AlumnoDto;
import dto.MateriaDto;

public class ObtenerDiploma {
    public String calcularNota(AlumnoDto){

//        Double promedio = AlumnoDto.getMaterias()
//                .stream().mapToDouble(n -> n.getNots().average())
//                .orElseThrow();
        String respuesta = "";
        try {
            double acuNotas = 0.0;
            for (MateriaDto materiaDto : AlumnoDto.getMaterias()) {
                acuNotas += materiaDto.getNota();
            }
            double promedio = acuNotas / AlumnoDto.getMaterias().size();
            return "El promedio es " + promedio;
        } catch (Exception e) {
            return "No hay materias para calcular el promedio";
        }

    }
}
