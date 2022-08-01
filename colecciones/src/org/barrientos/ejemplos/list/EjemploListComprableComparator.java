package org.barrientos.ejemplos.list;

import org.barrientos.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComprableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Zeus2",2));
        sa.add(new Alumno("Lucas",2));
        sa.add(new Alumno("Lucas",4));
        //Collections.sort(sa, (a,b)-> a.getNombre().compareTo(b.getNombre()));
        //sa.sort((a,b)-> a.getNombre().compareTo(b.getNombre()));
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        System.out.println(sa);

        System.out.println("Expresion Lambda");
        sa.forEach(System.out::println);
    }
}
