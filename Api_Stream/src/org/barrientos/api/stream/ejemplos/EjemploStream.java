package org.barrientos.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        //Stream<String> nombres = Stream.of("Pipa", "Pato", "Pepa", "Paco");
        //nombres.forEach(System.out::println);

        /*
        String[] arr = {"Pipa", "Pato", "Pepa", "Paco"};
        Stream<String> nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);
        */

        /*Stream<String> nombres = Stream.<String>builder()
                .add("Pato")
                .add("Pipa")
                .add("Paco")
                .add("Pepe")
                .build();
        nombres.forEach(System.out::println);
        */

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Pipa");
        lista.add("Paco");
        lista.add("Pepe");

        Stream<String> nombres = lista.stream();
        lista.stream().forEach(System.out::println);





    }
}
