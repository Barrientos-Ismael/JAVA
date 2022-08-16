package org.barrientos.api.stream.ejemplos;

import org.barrientos.api.stream.ejemplos.models.Factura;
import org.barrientos.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("John", "Doe");
        Usuario usuario2 = new Usuario("Pepe", "Perez");

        usuario1.addFactura(new Factura("Compras tecnologias"));
        usuario1.addFactura(new Factura("Compra muebles"));

        usuario2.addFactura(new Factura("Bicicleta"));
        usuario2.addFactura(new Factura("Notebook"));

        List<Usuario> usuarios = Arrays.asList(usuario1,usuario2);


        usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream)
                .forEach(f -> System.out.println(f.getDescripcion().concat(": Cliente ")
                        .concat(f.getUsuario().toString())));


        /*
        usuarios.stream().flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(": Cliente ")
                        .concat(f.getUsuario().toString())));
        */


        /*
        for (Usuario u: usuarios){
            for (Factura f: u.getFacturas())
                System.out.println(f.getDescripcion());
        }
        */

    }
}
