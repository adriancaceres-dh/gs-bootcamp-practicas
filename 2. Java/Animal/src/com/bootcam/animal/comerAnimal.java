package com.bootcam.animal;



public class comerAnimal {
    public static void comerAnimal(Animal animal) {
        if (animal instanceof ComerCarne) {
            ((ComerCarne) animal).comerCarne();
        } else if (animal instanceof ComerHierba) {
            ((ComerHierba) animal).comerHierba();
        } else {
            System.out.println("El animal no tiene definido su tipo de alimentación.");
        }
    }
}