package org.barrientos.java8lambda;

import org.barrientos.java8lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {



        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBI = (nombre, edad) ->
            System.out.println(nombre + " tiene edad " + edad + " años.");


        consumidorBI.accept("Pepe", 20);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola expresion lambda");

        List<String> nombres = Arrays.asList("Ismael", "Antonella", "Negri", "Paco");
        nombres.forEach(consumidor2);

        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = crearUsuario.get();

        /*
        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
          persona.setNombre(nombre);
        };
        */
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Ismael");
        System.out.println("Nombre del usuario: " + usuario.getNombre());

        /*
        Supplier<String> proveedor = () -> {
            return "Hola mundo lambda supplier";
        };
         */

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";
        System.out.println(proveedor.get());

    }
}
