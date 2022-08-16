package org.barrientos.api.stream.ejemplos;

import org.barrientos.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pipa Lopez", "Pepe Mendez", "Pato Gonzales", "Pepa Hernandez", "Paco Alvarez", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("Pepe"))
                        return Stream.of(u);
                    return Stream.empty();
                })
                .peek(System.out::println);

        //nombres.forEach(System.out::println);

        System.out.println(nombres.count());





    }
}
