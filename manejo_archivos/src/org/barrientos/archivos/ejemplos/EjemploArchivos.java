package org.barrientos.archivos.ejemplos;

import org.barrientos.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploArchivos {
    public static void main(String[] args) {

        String nombreArchivo = "D:\\ArchivosDeProgramas\\INFORMATICA\\Java\\IdeaProjects\\Archivos\\Java.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);

    }
}
