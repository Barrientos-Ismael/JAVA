package org.barrientos.poointerfaces.repositorio.lista;

import org.barrientos.poointerfaces.modelo.Cliente;
import org.barrientos.poointerfaces.repositorio.AbstractaClienteListRepositorio;
import org.barrientos.poointerfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaClienteListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = this.ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = this.ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    private static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}

