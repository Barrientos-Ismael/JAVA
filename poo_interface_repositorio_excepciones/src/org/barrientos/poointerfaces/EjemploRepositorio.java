package org.barrientos.poointerfaces;

import org.barrientos.poointerfaces.modelo.Cliente;
import org.barrientos.poointerfaces.repositorio.*;
import org.barrientos.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.barrientos.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.barrientos.poointerfaces.repositorio.excepciones.LecutraAccesoDatoException;
import org.barrientos.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import org.barrientos.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Bea", "Gonzalez"));
            repo.crear(new Cliente("Luci", "Martinez"));
            repo.crear(new Cliente("Ismael", "Barrientos"));
            Cliente ismael = new Cliente("Ismael", "Barrientos");
            repo.crear(ismael);
            repo.crear(ismael);

            //repo.crear(null);

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println("----------Paginable----------");

            List<Cliente> paginable = repo.listar(0, 2);
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
        } catch (RegistroDuplicadoAccesoDatoException e){
            System.out.println("Registro duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecutraAccesoDatoException e){
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e){
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e){
            System.out.println("Generica: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
