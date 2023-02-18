import java.util.*;


public class CollectionNotasClase {
    public static void main(String[] args){
/*
     //ARRAYLISTS

        ArrayList <String> listaPersonas=new ArrayList <String>();  // list <String> nombres = new linkedList<>(); puede ser asi
        //listaPersonas.add("Valentina");
       // String name= "messi"; // esto es por ejemplo que hay en playground que usa personas en vez de string
       // int cantidadMundiales=1;// seria que personas puede agrupar int,string...
        // int edad=35; esto es con el profesor Marco


        List<String>nombres=new ArrayList<>(); //buena practica listas ponerlas en plural "nombres"
        nombres.add("vale");
        nombres.add("Roman");
        System.out.println(nombres); //imprimir todos los nombres
        for (String nombre:nombres){
            System.out.println(nombre);
        }
        nombres.add("Alai");
        System.out.println(nombres);
        nombres.add(0,"maria"); //para agregar primero a la lista
        System.out.println(nombres);

        List<String>masNombres=new ArrayList<>();
        masNombres.add("alguien");
        masNombres.add("alguien mas");
        nombres.addAll(1,masNombres);//para agregarlo desde el indice 1
        System.out.println(nombres);
        System.out.println(nombres.get(1));//seleccionar el elemento con este indice
        System.out.println(nombres.indexOf("alguien")); //para saber donde esta ubicado
        System.out.println(nombres.remove(1)); //eliminar con ese indice
        System.out.println(nombres.remove(nombres.indexOf("Maria"))); //eliminar por nombre

*/

        //LINKEDLIST

        //MAPAS
     /*
        Map<String,String> indice = new HashMap<>(); // para usar ordena usar un TreeMap en vez de Hash...
        Map<String,String> indice2 = new TreeMap<>(); // DESVENTAJA gasto más de tiempo
        indice.put("pag1","prologo");
        indice.put("pag2","indice");
        indice.put("pag3","capitulo");
        indice.put("pag4","biblgrafia");


        indice2.put("pag5","prologo");
        indice2.put("pag6","indice");
        indice2.put("pag7","capitulo");
        indice2.put("pag8","biblgrafia");
        //System.out.println(indice.get("pag4"));

        /*for (Map.Entry<String,String>pagina:indice.entrySet()) {
            //System.out.println(pagina.getValue());//forma recorrer un mapa no lo recorre en orden este caso
            //System.out.println(pagina.getKey() + " " + pagina.getValue()); //pone de q pag es pero no en orden

        }*/
        /*for (Map.Entry<String,String>pagina:indice2.entrySet()) {
            System.out.println(pagina.getKey() + " " + pagina.getValue()); //ahora si en orden

        }*/
    /*

        Map<String,List<String>> indice =new TreeMap<>();
        indice.put("cap1",List.of ("pag1","pag2","pag3"));
        indice.put("cap2",List.of ("pag4","pag5","pag6"));
        indice.put("cap3",List.of ("pag7","pag8","pag9"));

        Map<String,Map<String,List<String>>> indices = new HashMap<>();
        for (Map.Entry<String,List<String>> capitulo:indice.entrySet()) {
            System.out.println(capitulo.getKey() + " " + capitulo.getValue());
        }
 */
    }
}
