package org.barrientos.poointerfaces.repositorio.lista;

import org.barrientos.poointerfaces.modelo.Producto;
import org.barrientos.poointerfaces.repositorio.AbstractaListRepositorio;
import org.barrientos.poointerfaces.repositorio.Direccion;
import org.barrientos.poointerfaces.repositorio.excepciones.LecutraAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {

    @Override
    public void editar(Producto producto) throws LecutraAccesoDatoException {
        Producto p = porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
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

    private static int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
