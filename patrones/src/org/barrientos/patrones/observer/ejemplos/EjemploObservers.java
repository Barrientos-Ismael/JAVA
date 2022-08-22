package org.barrientos.patrones.observer.ejemplos;

import org.barrientos.patrones.observer.Corporacion;

public class EjemploObservers {
    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("John: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Maria: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Ismael: " + observable);
        });

        google.modificaPrecio(2000);

    }
}
