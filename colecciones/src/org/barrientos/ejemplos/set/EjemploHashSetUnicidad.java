package org.barrientos.ejemplos.set;

import org.barrientos.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>();
        //List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Zeus2",2));
        sa.add(new Alumno("Lucas",2));
        sa.add(new Alumno("Lucas",4));
        System.out.println(sa);

        /*
        System.out.println("For clasico");
        for(int i = 0; i<sa.size(); i++){
            System.out.println(sa.get(i));
        }
        */

        System.out.println("Iterando usando forEach");
        for(Alumno a: sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while e Iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Expresion Lambda");
        sa.forEach(System.out::println);
    }
}
