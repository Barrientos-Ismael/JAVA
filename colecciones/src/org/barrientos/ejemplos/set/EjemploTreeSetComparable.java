package org.barrientos.ejemplos.set;

import org.barrientos.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>((a,b) -> b.getNota().compareTo(a.getNota()));
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNombre).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Lucas",8));

        System.out.println(sa);
    }
}
