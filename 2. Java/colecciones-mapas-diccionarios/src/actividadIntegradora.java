import java.util.*;

class Persona{
    int dni;
    String nombre;
    String apellido;
    int edad;
    long celular;
    long numEmergencia;
    String grupoSanguineo;
    int numeroParticipante;

    public int getNumeroParticipante() {
        return numeroParticipante;
    }

    public void setNumeroParticipante(int numeroParticipante) {
        this.numeroParticipante = numeroParticipante;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getNumEmergencia() {
        return numEmergencia;
    }

    public void setNumEmergencia(long numEmergencia) {
        this.numEmergencia = numEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", numeroParticipante=" + numeroParticipante +
                ", numEmergencia=" + numEmergencia +
                '}';
    }
}

public class actividadIntegradora {
    public static void main(String[] args) {

        //Inscribir participantes a una carrera mostrando informes de dichas inscripciones.

        List<Persona> participantesChico = new ArrayList<>();
        List<Persona> participantesMediano = new ArrayList<>();
        List<Persona> participantesAvanzado = new ArrayList<>();
        List<Persona> participantesNoInscriptos = new ArrayList<>();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Bienvenido corredor!! A qué carrera desea inscribirse?");
        System.out.println("-------------------------------------------------------------");

        int continuar = 1, contador = 1;

        //Inscripción participantes por consola si se ingresa 1, si ingresa 0 corta el programa.
        while(continuar != 0){
            Scanner scanner = new Scanner(System.in);

            System.out.println("A que circuito desea inscribirse?");
            System.out.println("Presione: 1-Para Circuito Chico, 2-Circuito Mediano, 3-Circuito Avanzado");
            int circuito = scanner.nextInt();

            System.out.println("Ingresa el nombre: ");
            String nombre = scanner.next();

            System.out.println("Ingresa el apellido: ");
            String apellido = scanner.next();

            System.out.println("Ingresa el DNI: ");
            int dni = scanner.nextInt();

            System.out.println("Ingresa la edad: ");
            int edad = scanner.nextInt();

            System.out.println("Ingresa la celular: ");
            long celular = scanner.nextLong();

            System.out.println("Ingresa la número de emergencia: ");
            long numEmergencia = scanner.nextLong();

            System.out.println("Ingresa la grupo sanguíneo: ");
            String grupoSanguineo = scanner.next();

            int numeroParticipante = contador;

            //Crear nueva persona con los datos ingresados.
            Persona persona = new Persona();
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setDni(dni);
            persona.setEdad(edad);
            persona.setCelular(celular);
            persona.setNumEmergencia(numEmergencia);
            persona.setGrupoSanguineo(grupoSanguineo);
            persona.setNumeroParticipante(numeroParticipante);

            //Almacenar persona de acuerdo al circuito elegido
            switch (circuito){
                case 1:
                    participantesChico.add(persona);
                    break;

                case 2:
                    participantesMediano.add(persona);
                    break;

                case 3:
                    if(persona.edad >= 18) {
                        participantesAvanzado.add(persona);
                    }else{
                        participantesNoInscriptos.add(persona);
                    }
                    break;

                default:
                    System.out.println("Ocurrio un error. No puso agregar el participante.");
            }

            //aumentar el contador para incrementar en 1 el num de participante
            contador++;

            //al presionar 1 vuelve a pedir datos de personas, al presionar 0 sale del while y continua.
            System.out.println("-------------------------------------------------------------");
            System.out.println("Deseas agregar otro participante? 0-No 1-Si");
            continuar = scanner.nextInt();

        }

        //Imprimir por consola los participantes de cada categoria
        System.out.println("----------------------------------------------------");
        System.out.println("Participantes Circuito Chico: ");
        for (Persona persona : participantesChico) {
            if(persona.getEdad() >= 18){
                System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $1500.");
            }else{
                System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $1300.");
            }
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Participantes Circuito Mediano: ");
        for (Persona persona : participantesMediano) {
            if(persona.getEdad() >= 18){
                System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $2300.");
            }else{
                System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $2000.");
            }
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Participantes Circuito Avanzado: ");
        for (Persona persona : participantesAvanzado) {
            System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni()+ ". Debe abonar: $2800.");
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Participantes No inscriptos: ");
        for (Persona persona : participantesNoInscriptos) {
            System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
        }
        System.out.println("----------------------------------------------------");


        //Desinscribir participante
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("¿Desea eliminar la inscripción de un participante?");
        System.out.println("Ingresar 1-SI 2-NO");
        int desinscribir = scanner.nextInt();

        while (desinscribir == 1){
            System.out.println("----------------------------------------------------");

            System.out.println("Ingresa la categoria del participante: ");
            System.out.println("Presione: 1-Para Circuito Chico, 2-Circuito Mediano, 3-Circuito Avanzado");
            int categoria = scanner.nextInt();

            System.out.println("Ingresa el DNI del participante a eliminar: ");
            int dniEliminar = scanner.nextInt();

            switch (categoria){
                case 1:
                    for (int i = 0; i < participantesChico.size(); i++) {
                        if (participantesChico.get(i).getDni() == dniEliminar) {
                            System.out.println("Se ha eliminado el participante con DNI: " + participantesChico.get(i).getDni() + ". Nombre y Apellido: " + participantesChico.get(i).getNombre() + " " + participantesChico.get(i).getApellido());
                            participantesChico.remove(participantesChico.get(i));
                        }else{
                            System.out.println("Participante no encontrado");
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < participantesMediano.size(); i++) {
                        if (participantesMediano.get(i).getDni() == dniEliminar) {
                            System.out.println("Se ha eliminado el participante con DNI: " + participantesMediano.get(i).getDni() + ". Nombre y Apellido: " + participantesMediano.get(i).getNombre() + " " + participantesMediano.get(i).getApellido());
                            participantesMediano.remove(participantesMediano.get(i));
                        }else{
                            System.out.println("Participante no encontrado");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < participantesAvanzado.size(); i++) {
                        if (participantesAvanzado.get(i).getDni() == dniEliminar) {
                            System.out.println("Se ha eliminado el participante con DNI: " + participantesAvanzado.get(i).getDni() + ". Nombre y Apellido: " + participantesAvanzado.get(i).getNombre() + " " + participantesAvanzado.get(i).getApellido());
                            participantesAvanzado.remove(participantesAvanzado.get(i));
                        }else{
                            System.out.println("Participante no encontrado");
                        }
                    }
                    break;

            }

            System.out.println("----------------------------------------------------");
            System.out.println("Desea eliminar otro participante? ");
            System.out.println("Ingresar: 1(si) 2(no)");
            int seguir = scanner.nextInt();

            //Imprimir por consola los participantes de cada categoria y cambiar el valor de desinscribir si decide no eliminar mas participantes.
            if(seguir == 2){
                System.out.println("----------------------------------------------------");
                System.out.println("Participantes Circuito Chico: ");
                for (Persona persona : participantesChico) {
                    System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
                }
                System.out.println("----------------------------------------------------");

                System.out.println("Participantes Circuito Mediano: ");
                for (Persona persona : participantesMediano) {
                    System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
                }
                System.out.println("----------------------------------------------------");

                System.out.println("Participantes Circuito Avanzado: ");
                for (Persona persona : participantesAvanzado) {
                    System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
                }
                System.out.println("----------------------------------------------------");

                System.out.println("Participantes No inscriptos: ");
                for (Persona persona : participantesNoInscriptos) {
                    System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
                }
                System.out.println("----------------------------------------------------");

                desinscribir = 0;
            }
        }

        //Calcular total recaudado por categoria y por carrera
        Map<String, List<Persona>> carrera = new TreeMap<>();
        carrera.put("Circuito Chico", participantesChico);
        carrera.put("Circuito Mediano", participantesMediano);
        carrera.put("Circuito Avanzado", participantesAvanzado);

        double[] montoPorCircuito = {0.0,0.0,0.0};

        for (Map.Entry<String,List<Persona>> circuito : carrera.entrySet()){
            for (Persona persona : circuito.getValue()) {
                if(circuito.getKey().equals("Circuito Chico")){
                    if(persona.getEdad() < 18){
                        montoPorCircuito[0] += 1300;
                    }else{
                        montoPorCircuito[0] += 1500;
                    }
                }
                if(circuito.getKey().equals("Circuito Mediano")){
                    if(persona.getEdad() < 18){
                        montoPorCircuito[1] += 2000;
                    }else{
                        montoPorCircuito[1] += 2300;
                    }
                }
                if(circuito.getKey().equals("Circuito Avanzado")){
                    montoPorCircuito[2] += 2800;
                }
            }

        }

        System.out.println("--------------------------------------------------------");
        System.out.println("El monto recaudado por cada categoria es de:");
        System.out.println("CIRCUITO CHICO: $" + montoPorCircuito[0]);
        System.out.println("CIRCUITO MEDIANO: $" + montoPorCircuito[1]);
        System.out.println("CIRCUITO AVANZADO: $" + montoPorCircuito[2]);
        System.out.println("--------------------------------------------------------");
        System.out.println("La suma recaudada por la CARRERA es de: $" + (montoPorCircuito[0]+montoPorCircuito[1]+montoPorCircuito[2]));
        System.out.println("--------------------------------------------------------");


    }

}
