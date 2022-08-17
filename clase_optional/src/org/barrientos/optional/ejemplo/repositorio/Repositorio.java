package org.barrientos.optional.ejemplo.repositorio;

import org.barrientos.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio <T> {
    Optional<Computador> filtrar(String nombre);

}
