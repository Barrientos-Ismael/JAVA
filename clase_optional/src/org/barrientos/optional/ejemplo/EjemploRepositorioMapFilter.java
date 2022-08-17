package org.barrientos.optional.ejemplo;

import org.barrientos.optional.ejemplo.models.Computador;
import org.barrientos.optional.ejemplo.models.Fabricante;
import org.barrientos.optional.ejemplo.models.Procesador;
import org.barrientos.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.barrientos.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();


        String fabricante = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(f -> "Intel".equalsIgnoreCase(f.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println("Fabricante = " + fabricante);

        /*
        Fabricante f = repositorio.filtrar("rog")
                        .map(Computador::getProcesador)
                        .map(Procesador::getFabricante)
                        .orElseThrow();
        System.out.println("Fabricant = " + f.getNombre());
        */
    }

}
