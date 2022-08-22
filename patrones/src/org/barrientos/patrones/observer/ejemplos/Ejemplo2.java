package org.barrientos.patrones.observer.ejemplos;

import org.barrientos.patrones.observer.UsuarioRepositorio;

public class Ejemplo2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o, u) -> System.out.println("Enviando un email al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un email al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardando info del usuario " + u + ", en el log"));
        repo.crearUsuario("Ismael");


    }
}
