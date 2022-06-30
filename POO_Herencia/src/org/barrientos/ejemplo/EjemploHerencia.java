package org.barrientos.ejemplo;

import org.barrientos.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("========CREANDO INSTANCIA DE CLASE ALUMNO========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Ismael");
        alumno.setApellido("Barrientos");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaLengua(6.5);
        alumno.setNotaHistoria(7.9);
        alumno.setNotaMatematica(4.3);


        System.out.println("========CREANDO INSTANCIA DE CLASE ALUMNO INTERNACIONAL========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(8.5);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaLengua(7.0);
        alumnoInt.setNotaMatematica(6.8);

        System.out.println("========CREANDO INSTANCIA DE CLASE PROFESOR========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Rodolfo");
        profesor.setApellido("Suarez");
        profesor.setAsignatura("Matematica");

        System.out.println("================");

        System.out.println("alumno: " + alumno.getNombre() + " " + alumno.getApellido()
        +" " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
        + " " + alumnoInt.getApellido()
        + " " + alumnoInt.getPais());

        System.out.println("Profesor: " + profesor.getNombre()
            + " " + profesor.getApellido() + " de la asignatura " + profesor.getAsignatura());

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase "+padre);
            clase = clase.getSuperclass();
        }


    }
}
