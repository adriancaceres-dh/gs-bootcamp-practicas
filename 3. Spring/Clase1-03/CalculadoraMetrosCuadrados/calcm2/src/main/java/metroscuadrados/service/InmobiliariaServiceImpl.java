package metroscuadrados.service;

import metroscuadrados.dto.HabitacionDTO;
import metroscuadrados.dto.PropiedadDTO;
import org.springframework.stereotype.Service;

@Service
public class InmobiliariaServiceImpl implements InmobiliariaService{



    @Override
    public String CantidadM2(PropiedadDTO propiedadDto) {
        return "Cantidad m2 por propiedad " + propiedadDto.cantidadM2Total();
    }

    @Override
    public String precioPropiedad(PropiedadDTO propiedadDto) {
        return "Precio total de la propiedad " + propiedadDto.cantidadM2Total() * 800;
    }

    @Override
    public String habitacionGrande(PropiedadDTO propiedadDto) {
        HabitacionDTO habitacionGrande = new HabitacionDTO("primera", 0.0, 0.0);

        for (HabitacionDTO habitacion : propiedadDto.getHabitaciones()) {
            if(habitacion.cantidadM2() > habitacionGrande.cantidadM2()) {
                habitacionGrande = habitacion;
            }
        }
        return "La habitacion mas grande es " + habitacionGrande.getNombre() + ", con un tamaño de " + habitacionGrande.cantidadM2() + "m2.";
    }

    public String habitacion(PropiedadDTO propiedadDto) {
        String habitaciones = "La propiedad " + propiedadDto.getNombre() + ":\n";
        for (HabitacionDTO habitacion : propiedadDto.getHabitaciones()) {
            habitaciones += "La habitacion " + habitacion.getNombre() + " tiene " + habitacion.cantidadM2() + "m2.\n" ;
        }
        return habitaciones;
    }

}
