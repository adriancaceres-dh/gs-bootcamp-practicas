public class DesdeHasta <T,U>{

    private T desde;
    private U hasta;

    public DesdeHasta() {}
    public DesdeHasta(T desde, U hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    public T getDesde() {
        return desde;
    }

    public void setDesde(T desde) {
        this.desde = desde;
    }

    public U getHasta() {
        return hasta;
    }

    public void setHasta(U hasta) {
        this.hasta = hasta;
    }

    @Override
    public String toString() {
        return "DesdeHasta{" +
                "desde=" + desde +
                ", hasta=" + hasta +
                '}';
    }
}
