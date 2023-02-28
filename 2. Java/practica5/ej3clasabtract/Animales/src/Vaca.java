public class Vaca extends Animal implements Herviboro{

    @Override
    public String Sonido() {
        return "muuu";
    }

    @Override
    public String comerHierba() {
        return "hierba";
    }
}
