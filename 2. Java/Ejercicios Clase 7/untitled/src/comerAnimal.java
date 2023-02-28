public class comerAnimal {
    public static void comerAnimal(Animal animal) {
        if (animal instanceof comerCarne) {
            ((ComerCarne) animal).ComerCarne();
        } else if (animal instanceof ComerHierba) {
            ((ComerHierba) animal).comerHierba();
        } else {
            System.out.println("El animal no tiene definido su tipo de alimentacion.");

        }
    }
}
