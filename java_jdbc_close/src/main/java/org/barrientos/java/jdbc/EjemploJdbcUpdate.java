package org.barrientos.java.jdbc;

import org.barrientos.java.jdbc.modelo.Categoria;
import org.barrientos.java.jdbc.modelo.Producto;
import org.barrientos.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.barrientos.java.jdbc.repositorio.Repositorio;
import org.barrientos.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;


public class EjemploJdbcUpdate {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("------------------ Listar ---------------");
            repositorio.listar().forEach(System.out::println);
            System.out.println("------------------ Obtener por ID ---------------");
            System.out.println(repositorio.porId(2L));
            System.out.println("------------------ EDITAR NUEVO PRODUCTO ---------------");
            Producto producto = new Producto();
            producto.setId(4L);
            producto.setNombre("Teclado Corsair k95 mecanico");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con exito!");
            repositorio.listar().forEach(System.out::println);
    }
}
