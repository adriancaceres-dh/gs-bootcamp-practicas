public abstract class Animal  {
    protected String sonido;

    public Animal() {}

    public Animal(String sonido) {
        this.sonido = sonido;
    }

    public void emitirSonido() {}

    public String getSonido(String gato1) {
        return sonido;
    }

    public String setSonido() {
        this.sonido = sonido;
        return null;
    }

    public abstract void ComerCarne();
}