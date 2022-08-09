package org.barrientos.threads.ejemploexecutor;

import org.barrientos.threads.ejemplosync.Panaderia;
import org.barrientos.threads.ejemplosync.runnable.Cliente;
import org.barrientos.threads.ejemplosync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size() );

        Panaderia panaderia = new Panaderia();
        Runnable productor = new Panadero(panaderia);
        Runnable consumidor = new Cliente(panaderia);

        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size() );

        executor.shutdown();
        System.out.println("Continuando con la ejecucion del main");


    }
}
