package org.barrientos.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pipa Lopez", "Pepe Mendez", "Pato Gonzales", "Pepa Hernandez", "Paco Alvarez", "Pepe Garcia", "Paco Alvarez", "Paco Alvarez", "Paco Alvarez")
                .distinct();

        String resultado = nombres.reduce("resultado concatenacion ", (a,b) -> a+ "# " + b);
        System.out.println(resultado);


    }
}
