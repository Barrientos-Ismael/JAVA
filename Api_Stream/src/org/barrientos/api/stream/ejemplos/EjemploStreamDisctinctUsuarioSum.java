package org.barrientos.api.stream.ejemplos;

import org.barrientos.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDisctinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream
                .of("Pipa Lopez", "Pepe Mendez", "Pato Gonzales", "Pepa Hernandez", "Paco Alvarez", "Pepe Garcia", "Pato Gonzales", "Pato Gonzales")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        //largoNombres.forEach(System.out::println);
        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("Total: " + stats.getSum());
        System.out.println("Max = " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Prom = " + stats.getAverage());


        //UN OPERADOR FINAL
    }
}
