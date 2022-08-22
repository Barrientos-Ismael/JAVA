package org.barrientos.patrones.composite.ejemplo;

import org.barrientos.patrones.composite.Archivo;
import org.barrientos.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java)
            .addComponente(new Archivo("cv.docx"))
            .addComponente(new Archivo("logo.jpeg"));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("encontrado \"patron-composite.docx\" = " + encontrado);

        encontrado = doc.buscar("ApI sTream");
        System.out.println("Encontraro Api Stream: " + encontrado);
        
        encontrado = doc.buscar("cv.docx");
        System.out.println("encontrado cv.docx= " + encontrado);
        
        //System.out.println(doc.mostrar(0));


    }
}
