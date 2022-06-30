package org.barrientos.ejemplo;

import jdk.swing.interop.SwingInterOpUtils;
import org.barrientos.pooherencia.*;

public class EjemploHerenciaConstructores {
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

        System.out.println("alumno: " + alumno.getNombre() + " " + alumno.getApellido()
        +" " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
        + " " + alumnoInt.getApellido()
        + " " + alumnoInt.getPais());

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("--ALUMNO---");
        System.out.println("Nombre: "+ persona.getNombre() +
        ", Apellido: "+ persona.getApellido() + ", Edad: " +
                persona.getEdad() + ", email: "+ persona.getEmail());

        if (persona instanceof Alumno){
            System.out.println("--ALU- INT");
            System.out.println("instituto: " + ((Alumno)persona).getInstitucion());
            System.out.println("Notas" + ((Alumno)persona).getNotaMatematica()
            + " " + ((Alumno)persona).getNotaHistoria() + " " + ((Alumno)persona).getNotaLengua());
            if (persona instanceof AlumnoInternacional){
                System.out.println("Nota idioma " + ((AlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional)persona).getPais());
            }
        }

        if (persona instanceof Profesor){
            System.out.println("--PROFESOR--");
            System.out.println("Asignatura: " + (((Profesor)persona).getAsignatura()));
        }

    }

}
