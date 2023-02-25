package animales;
public interface GustosAlimenticios {
    public default void comerCarne() { System.out.println("Carnivoro"); }

    public default void comerHierba() { System.out.println("Herbivoro"); }
}
