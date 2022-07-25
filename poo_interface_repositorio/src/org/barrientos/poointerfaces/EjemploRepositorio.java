package org.barrientos.poointerfaces;

import org.barrientos.poointerfaces.modelo.Cliente;
import org.barrientos.poointerfaces.repositorio.*;

import java.util.ArrayList;
import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea","Gonzalez"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Ismael", "Barrientos"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("----------Paginable----------");

        List<Cliente> paginable = repo.listar(0,2);
        paginable.forEach(System.out::println);

        System.out.println("----------Ordenable----------");
        List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("----------Editar----------");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);

        System.out.println("----------Eliminar----------");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);


        System.out.println("TOTAL REGISTROS: " + repo.total());
    }
}
