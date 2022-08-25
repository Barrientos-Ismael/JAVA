package org.barrientos.java.jdbc;

import org.barrientos.java.jdbc.modelo.Producto;
import org.barrientos.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.barrientos.java.jdbc.repositorio.Repositorio;
import org.barrientos.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;


public class EjemploJdbcDelete {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("------------------ Listar ---------------");
            repositorio.listar().forEach(System.out::println);
            System.out.println("------------------ Obtener por ID ---------------");
            System.out.println(repositorio.porId(2L));
            System.out.println("------------------ ELIMINAR NUEVO PRODUCTO ---------------");
            repositorio.eliminar(5L);
            System.out.println("Producto eliminado con exito!");
            repositorio.listar().forEach(System.out::println);

    }
}
