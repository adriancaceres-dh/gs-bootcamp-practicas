import java.util.ArrayList;
import java.util.List;

public class Juegoasteroide {

    public class Juegoasteroide {

        private List<IParticipante> participantes = new ArrayList<>();

        public Juegoasteroide(List<IParticipante> participantes) {
            this.participantes = participantes;}


        public void jugar(Coordenada coordenada) {
            double menorDistancia = participantes.get(0).distancia(coordenada.getX(), coordenada.getY());
            int indice = 0;
            for (int i = 0; i < participantes.size(); i++) {
                System.out.println("Participante " + i + " , distancia " +
                        participantes.get(i).distancia(coordenada.getX(), coordenada.getY()));
                if (participantes.get(i).distancia(coordenada.getX(), coordenada.getY()))
                    < menorDistancia) {
                    indice = i;
                    menorDistancia = participantes.get(i).distancia(coordenada.getX(), coordenada.getY());
                }
            }
            participantes.get(indice).acumularPuntos();
        }

        public IParticipante ganador() {
            int mayorPuntos = 0;
            int indice = 0;
            for (int i = 0; i < participantes.size(); i++) {
                if (participantes.get(0).obtenerPuntos() > mayorPuntos) {
                    mayorPuntos = participantes.get(0).obtenerPuntos();
                    indice = i;
                }
            }
            return participantes.get(indice);
        }
    }