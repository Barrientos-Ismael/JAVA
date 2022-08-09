package org.barrientos.threads.ejemplosync;

import org.barrientos.threads.ejemplosync.runnable.Cliente;
import org.barrientos.threads.ejemplosync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia panaderia= new Panaderia();
        new Thread(new Panadero(panaderia)).start();
        new Thread(new Cliente(panaderia)).start();
    }
}
