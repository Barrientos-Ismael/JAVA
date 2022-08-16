package org.barrientos.api.stream.ejemplos;

import org.barrientos.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        long count = Stream
                .of("Pipa Lopez", "Pepe Mendez", "Pato Gonzales", "Pepa Hernandez", "Paco Alvarez", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);







    }
}
