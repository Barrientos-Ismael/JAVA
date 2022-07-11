package org.barrientos.ejemplo;

import org.barrientos.pooherencia.Alumno;
import org.barrientos.pooherencia.AlumnoInternacional;
import org.barrientos.pooherencia.Persona;
import org.barrientos.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("========CREANDO INSTANCIA DE CLASE ALUMNO========");
        Alumno alumno = new Alumno("Ismael","Barrientos",30,"Instituto Nacional");
        alumno.setNotaLengua(6.5);
        alumno.setNotaHistoria(7.9);
        alumno.setNotaMatematica(4.3);
        alumno.setEmail("asdasd@asdadsa");


        System.out.println("========CREANDO INSTANCIA DE CLASE ALUMNO INTERNACIONAL========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(8.5);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaLengua(7.0);
        alumnoInt.setNotaMatematica(6.8);
        alumnoInt.setEmail("asdasddas@asdasd");

        System.out.println("========CREANDO INSTANCIA DE CLASE PROFESOR========");
        Profesor profesor = new Profesor("Rodolfo", "Suarez","Matematica");
        profesor.setEdad(40);


        System.out.println("================");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
        System.out.println("======================");
    }

}
