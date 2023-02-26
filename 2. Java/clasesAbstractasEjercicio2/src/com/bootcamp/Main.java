package com.bootcamp;

public class Main {
    public static void main(String[] args) {

        Curriculums curriculums = new Curriculums();
        curriculums.imprimir();

        Informes informes = new Informes();
        informes.imprimir();

        LibrosPDF librosPDF = new LibrosPDF();
        librosPDF.imprimir();

    }
}