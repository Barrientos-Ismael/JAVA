package org.barrientos.java.jdbc;

import org.barrientos.java.jdbc.modelo.Categoria;
import org.barrientos.java.jdbc.modelo.Producto;
import org.barrientos.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.barrientos.java.jdbc.repositorio.Repositorio;
import org.barrientos.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;


public class EjemploJdbcTrx {
    public static void main(String[] args) throws SQLException {

        try (Connection conn = ConexionBaseDatos.getInstance()) {
            if (conn.getAutoCommit())
                conn.setAutoCommit(false);
            try {
                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("------------------ Listar ---------------");
                repositorio.listar().forEach(System.out::println);
                System.out.println("------------------ Obtener por ID ---------------");
                System.out.println(repositorio.porId(2L));
                System.out.println("------------------ INSERTAR NUEVO PRODUCTO ---------------");
                Producto producto = new Producto();
                producto.setNombre("Teclado IBM mecanico v2");
                producto.setPrecio(1550);
                producto.setFechaRegistro(new Date());
                Categoria categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                producto.setSku("a1b2c3d4");
                repositorio.guardar(producto);
                System.out.println("Producto guardado con exito!");

                System.out.println("------------------ EDITAR NUEVO PRODUCTO ---------------");
                producto = new Producto();
                producto.setId(4L);
                producto.setNombre("Teclado Corsair k95 mecanico");
                producto.setPrecio(900);
                producto.setSku("abcde12345");
                categoria = new Categoria();
                categoria.setId(2L);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);
                System.out.println("Producto actualizado con exito!");
                repositorio.listar().forEach(System.out::println);

                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
        }
    }
}
