package org.barrientos.poointerfaces.repositorio;

import org.barrientos.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);



}
