public class Vaca extends Animal implements ComerHierba {

    public void EmitirSonido() { System.out.println("Muuuu!"); }

    @Override
    public void ComerHierba() { System.out.println("Es herbivoro"); }
}




