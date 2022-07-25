package org.barrientos.poointerfaces.repositorio;

import org.barrientos.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
