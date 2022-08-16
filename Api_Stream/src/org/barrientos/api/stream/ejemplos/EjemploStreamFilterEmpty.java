package org.barrientos.api.stream.ejemplos;

import org.barrientos.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

       long count = Stream
                .of("Pipa Lopez", "Pepe Mendez", "Pato Gonzales", "", "Paco Alvarez", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);


    }
}
