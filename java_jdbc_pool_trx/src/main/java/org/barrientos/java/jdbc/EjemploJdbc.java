package org.barrientos.java.jdbc;

import org.barrientos.java.jdbc.modelo.Categoria;
import org.barrientos.java.jdbc.modelo.Producto;
import org.barrientos.java.jdbc.repositorio.CategoriaRepositorioImpl;
import org.barrientos.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.barrientos.java.jdbc.repositorio.Repositorio;
import org.barrientos.java.jdbc.service.CatalogoServicio;
import org.barrientos.java.jdbc.service.Service;
import org.barrientos.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;


public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Service servicio = new CatalogoServicio();
        System.out.println("------------------ Listar ---------------");
        servicio.listar().forEach(System.out::println);



        System.out.println("------------------Insertar nueva categoria------------------");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminacion");


        System.out.println("------------------ INSERTAR NUEVO PRODUCTO ---------------");
        Producto producto = new Producto();
        producto.setNombre("Lampara led escritorio");
        producto.setPrecio(90);
        producto.setFechaRegistro(new Date());
        producto.setSku("ab12345678");

        servicio.guardarProductoCategoria(producto, categoria);
        System.out.println("Producto guardado con exito! " + producto.getId());
        servicio.listar().forEach(System.out::println);

    }
}
