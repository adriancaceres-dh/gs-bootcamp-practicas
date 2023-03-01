package com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma;

import com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.DTO.AsignaturaDTO;
import com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.DTO.DiplomaDTO;
import com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.DTO.EstudianteDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Clase2EjercicioDiplomaApplication {

	public static void main(String[] args) {

		SpringApplication.run(Clase2EjercicioDiplomaApplication.class, args);

		/*EstudianteDTO alumno1 = new EstudianteDTO();
		List<AsignaturaDTO> asignaturas = new ArrayList<>();
		AsignaturaDTO matematicas = new AsignaturaDTO("Matematica",9.0);
		AsignaturaDTO lengua = new AsignaturaDTO("Lengua",9.5);
		asignaturas.add(matematicas);
		asignaturas.add(lengua);
		alumno1.setNombre("Luciano");
		alumno1.setAsignaturasAprobadas(asignaturas);

		System.out.println(alumno1);

		System.out.println(alumno1.calcularPromedio(alumno1));

		DiplomaDTO diploma = new DiplomaDTO();
		diploma.setEstudiante(alumno1);
		diploma.setPromedio(alumno1.calcularPromedio(alumno1));
		if(diploma.getPromedio() > 9){
			diploma.setMensaje("Recibido con honores");
		}else{
			diploma.setMensaje("Recibido");
		}

		System.out.println(diploma);*/
	}

}
