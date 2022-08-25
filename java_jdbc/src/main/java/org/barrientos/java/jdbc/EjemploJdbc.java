package org.barrientos.java.jdbc;

import org.barrientos.java.jdbc.modelo.Categoria;
import org.barrientos.java.jdbc.modelo.Producto;
import org.barrientos.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.barrientos.java.jdbc.repositorio.Repositorio;
import org.barrientos.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;


public class EjemploJdbc {
    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstance()) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("------------------ Listar ---------------");
            repositorio.listar().forEach(System.out::println);
            System.out.println("------------------ Obtener por ID ---------------");
            System.out.println(repositorio.porId(2L));
            System.out.println("------------------ INSERTAR NUEVO PRODUCTO ---------------");
            Producto producto = new Producto();
            producto.setNombre("Teclado Red Dragon mecanico");
            producto.setPrecio(450);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con exito!");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
