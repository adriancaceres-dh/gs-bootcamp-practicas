package Clase3.sp.obtenerDiploma.exception;

public class AlumnoException extends RuntimeException{


    private String mensaje;
    public AlumnoException(String mensaje){
        this.mensaje=mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
