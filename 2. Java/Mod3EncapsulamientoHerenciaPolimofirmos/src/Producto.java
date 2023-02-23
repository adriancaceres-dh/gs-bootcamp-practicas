public class Producto {

    //atributo de la clase producto
    String nombre;
    double precio;

    //Getter&&Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    };

    //constructor- Consultar error en PRECIO/PQ SOLO FUNCIONA CON VACIO?

    Producto producto = new Producto();


    //ToString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio +", ";
    }

    //metodo Calcular, parametro cantidad de producto

    public double calcular(int cantidadDeProductos){
        return precio*cantidadDeProductos;
    }
};

