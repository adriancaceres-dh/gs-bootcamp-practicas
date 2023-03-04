package metroscuadrados.service;

import metroscuadrados.dto.PropiedadDTO;

public interface InmobiliariaService {
    public String CantidadM2(PropiedadDTO propiedadDto);
    public String precioPropiedad(PropiedadDTO propiedadDTO);

    public String habitacionGrande(PropiedadDTO propiedadDTO);

    public String habitacion(PropiedadDTO propiedadDTO);

}
