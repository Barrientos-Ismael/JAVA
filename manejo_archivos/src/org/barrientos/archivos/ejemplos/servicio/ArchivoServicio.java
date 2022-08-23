package org.barrientos.archivos.ejemplos.servicio;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){
            buffer.append("Hola que tal amigos!\n").append("Todo bien? Escribiendo un archivo..\n")
                    .append("Hasta luego!\n");
            //buffer.close();
            System.out.println("Archivo creado con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void crearArchivo2 (String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? Escribiendo un archivo..");
            buffer.println("Hasta luego!");
            //buffer.close();
            System.out.println("Archivo creado con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo));){
            //BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ( (linea = reader.readLine()) !=null){
                sb.append(linea).append("\n");
            }
            //reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try (Scanner s = new Scanner(archivo)){
            //Scanner s = new Scanner(archivo);
            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }
            //s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
