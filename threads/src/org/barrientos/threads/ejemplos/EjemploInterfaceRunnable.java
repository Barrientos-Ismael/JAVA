package org.barrientos.threads.ejemplos;

import org.barrientos.threads.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Cordoba")).start();
        new Thread(new ViajeTarea("Santa Fe")).start();
        new Thread(new ViajeTarea("Buenos Aires")).start();
        new Thread(new ViajeTarea("Tierra del Fuego")).start();



    }
}
