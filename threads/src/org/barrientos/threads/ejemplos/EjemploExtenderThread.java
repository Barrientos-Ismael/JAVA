package org.barrientos.threads.ejemplos;

import org.barrientos.threads.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Ismael Barrientos");
        hilo.start();
        //Thread.sleep(1);
        Thread hilo2 = new NombreThread("Antonella");
        hilo2.start();

        Thread hilo3 = new NombreThread("Rocco");
        hilo3.start();
        System.out.println(hilo.getState());


    }
}
