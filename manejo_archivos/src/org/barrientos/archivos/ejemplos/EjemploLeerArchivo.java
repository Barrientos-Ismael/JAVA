package org.barrientos.archivos.ejemplos;

import org.barrientos.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\ArchivosDeProgramas\\INFORMATICA\\Java\\IdeaProjects\\Archivos\\Java.txt";
        ArchivoServicio service = new ArchivoServicio();
        System.out.println(service.leerArchivo2(nombreArchivo));

    }
}
