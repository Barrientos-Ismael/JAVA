package org.barrientos.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        IntStream num = IntStream.rangeClosed(5, 20)
                .peek(System.out::println);

        //int resultado = num.reduce(0, Integer::sum);
        //int resultado = num.sum();
        IntSummaryStatistics stats = num.summaryStatistics();

        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Prom: " + stats.getAverage());
        System.out.println("Total: " + stats.getCount());


    }
}
