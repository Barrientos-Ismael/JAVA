package org.barrientos.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Ismael");
        alumno.setApellido("Barrientos");

        Profesor profesor = new Profesor();
        profesor.setNombre("Rodolfo");
        profesor.setApellido("Suarez");
        profesor.setAsignatura("Matematica");

        System.out.println("alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor: " + profesor.getNombre()
            + " " + profesor.getApellido() + " de la asignatura " + profesor.getAsignatura());

    }
}
