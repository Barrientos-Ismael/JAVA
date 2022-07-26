package org.barrientos.poointerfaces;

import org.barrientos.poointerfaces.modelo.Cliente;
import org.barrientos.poointerfaces.modelo.Producto;
import org.barrientos.poointerfaces.repositorio.Direccion;
import org.barrientos.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.barrientos.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.barrientos.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Mesa", 50d));
        repo.crear(new Producto("Silla",18d));
        repo.crear(new Producto("Lampara", 15.5));
        repo.crear(new Producto("Notebook", 400.70));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);

        System.out.println("----------Paginable----------");

        List<Producto> paginable = repo.listar(0,2);
        paginable.forEach(System.out::println);

        System.out.println("----------Ordenable----------");
        List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        productosOrdenAsc.forEach(System.out::println);

        System.out.println("----------Editar----------");
        Producto lamparaActualizar = new Producto("Lampara Escritorio", 23.45);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara = repo.porId(3);
        System.out.println(lampara);

        repo.listar("precio", Direccion.ASC).forEach(System.out::println);

        System.out.println("----------Eliminar----------");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);


        System.out.println("TOTAL REGISTROS: " + repo.total());
    }
}
