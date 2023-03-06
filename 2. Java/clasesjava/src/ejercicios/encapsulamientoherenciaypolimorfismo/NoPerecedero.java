package ejercicios.encapsulamientoherenciaypolimorfismo;

public class NoPerecedero extends Producto{

    //atributos
    String tipo;

    //cuando creamos el constructor, nos trae tambien los atirbutos de la clase padre
    public NoPerecedero(String nombre, Double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
