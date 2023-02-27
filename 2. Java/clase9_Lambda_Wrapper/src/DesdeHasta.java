public class DesdeHasta<T extends Integer,D> { //extends solo permite que se ingresen int
    private T desde;
    private D hasta;

    public DesdeHasta() {

    }

    public T getDesde() {
        return desde;
    }

    public void setDesde(T desde) {
        this.desde = desde;
    }

    public D getHasta() {
        return hasta;
    }

    public void setHasta(D hasta) {
        this.hasta = hasta;
    }

    public DesdeHasta(T desde, D hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }
}