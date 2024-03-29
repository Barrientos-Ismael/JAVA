package org.barrientos.api.stream.ejemplos;

import org.barrientos.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pipa Lopez", "Pepe Mendez", "Pato Gonzales", "Pepa Hernandez", "Paco Alvarez", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepex"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuario("Jonh", "Doe")).getNombre());
        if (usuario.isPresent()) {
            System.out.println(usuario.get());
        } else System.out.println("No se encontró el objeto");





    }
}
