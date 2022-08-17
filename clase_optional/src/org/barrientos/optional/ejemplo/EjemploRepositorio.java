package org.barrientos.optional.ejemplo;

import org.barrientos.optional.ejemplo.models.Computador;
import org.barrientos.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.barrientos.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("Asus rog").ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("No se encontró")
        );

        /*
        Optional<Computador> pc = repositorio.filtrar("asus");
        if(pc.isPresent()) {
            System.out.println(pc.get().getNombre());
        } else System.out.println("No se encontró");
         */
    }
}
