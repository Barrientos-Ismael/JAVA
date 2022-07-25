package org.barrientos.poointerface.imprenta;

import org.barrientos.poointerface.imprenta.modelo.*;
import static org.barrientos.poointerface.imprenta.modelo.Genero.*;


public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Ismael", "Barrientos"), "Analista en TIC", "Resumen laboral...")
        .addExperiencia("Java")
        .addExperiencia("Python")
        .addExperiencia("Desarrollador fullstack");

        Libro libro = new Libro(new Persona("Erich","Gamma"), "Patrones de Diseño: Elem. Reusables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observer"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron composite"))
                .addPagina(new Pagina("Patron facade"));

        Informe informe = new Informe(new Persona("James", "Cameron"), new Persona("Martin","Holder"), "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

}
