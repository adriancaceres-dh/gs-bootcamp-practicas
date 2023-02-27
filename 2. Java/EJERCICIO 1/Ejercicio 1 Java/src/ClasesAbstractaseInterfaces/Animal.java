package ClasesAbstractaseInterfaces;

public abstract class Animal {
    private String sonido;

    public Animal(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "sonido='" + sonido + '\'' +
                '}';
    }

    public Animal(){};

    public void emitirSonido(){}
}
