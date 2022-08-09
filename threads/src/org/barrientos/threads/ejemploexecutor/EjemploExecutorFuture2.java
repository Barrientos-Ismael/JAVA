package org.barrientos.threads.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size() );

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea ... ");
            try {
                System.out.println("Nombre del thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea");
            return "Algun resultado importante de la tarea";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Iniciando tarea 2... ");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);

        System.out.println("Tamaño del pool: " + executor.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size() );

        executor.shutdown();
        System.out.println("Continuando con la ejecucion del main");

        //System.out.println(resultado.isDone());
        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("Resultado1: %s - Resultado2: %s - Resultado3: %s",
                    resultado.isDone()? "Finalizo": "En Proceso",
                    resultado2.isDone()? "Finalizo": "En Proceso",
                    resultado3.isDone()? "Finalizo": "En Proceso"));
            TimeUnit.MILLISECONDS.sleep(100);
        }
        System.out.println("Se obtiene resultado 1: " + resultado.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());

        System.out.println("Se obtiene resultado 2: " + resultado2.get());
        System.out.println("Finaliza la tarea: " + resultado2.isDone());

        System.out.println("Se obtiene resultado 3: " + resultado3.get());
        System.out.println("Finaliza la tarea: " + resultado3.isDone());



    }
}
