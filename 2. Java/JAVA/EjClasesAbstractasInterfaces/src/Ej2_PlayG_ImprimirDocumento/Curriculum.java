package Ej3_PlayG_ImprimirDocumento;

import java.util.ArrayList;
import java.util.List;

public class Curriculum {
    private String nombrePersona;
    private String apellidoPersona;
    private List<String> habilidadesPersona = new ArrayList<>();

    public Curriculum() {
    }

    public Curriculum(String nombrePersona, String apellidoPersona, List<String> habilidadesPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.habilidadesPersona = habilidadesPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public List<String> getHabilidadesPersona() {
        return habilidadesPersona;
    }

    public void setHabilidadesPersona(List<String> habilidadesPersona) {
        this.habilidadesPersona = habilidadesPersona;
    }

    @Override
    public String toString() {
        return "Ej3_PlayG_ImprimirDocumento.Curriculum{" +
                "nombrePersona='" + nombrePersona + '\'' +
                ", apellidoPersona='" + apellidoPersona + '\'' +
                ", habilidadesPersona=" + habilidadesPersona +
                '}';
    }
}
