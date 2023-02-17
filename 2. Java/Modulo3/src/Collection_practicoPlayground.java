import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection_practicoPlayground {
    public class Prenda{
        String marca  [ ];
        String modelo  [ ];
    }
    public class GuardaRopa{
        private Integer contador;
        private Map<Integer, List<Prenda>> diccionario;
        public GuardaRopa() {
        this.contador = 0;
        HashMap<Integer,List<Prenda>> mapa = new HashMap<>();
        }
        public Integer guardarPrendas(List<Prenda> prendasAGuardar){

            Integer key = contador;
            diccionario.put(key,prendasAGuardar);
            contador++;
            return key;
        }
        public List<Prenda> devolverPrendas(Integer numero){

            List<Prenda> prendas = diccionario.remove(numero);
            return prendas;
        }
        public void mostrarPrendas(){
            for (Integer key: diccionario.keySet()){
                List<Prenda> listaDePrendas = diccionario.get(key);
                System.out.println(listaDePrendas);
            }
        }

        public Map<Integer, List<Prenda>> getDiccionario() {
            return diccionario;
        }
    }
}
