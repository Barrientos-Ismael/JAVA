package org.barrientos.ejemplos.list;

import org.barrientos.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("Esta vacia = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4)); // se elimina x andres
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));
        System.out.println(al + ", size = " + al.size());

        al.remove(new Alumno("Jano", 7)); //Debe ser identico
        //al.remove(0)
        System.out.println(al + ", size = " + al.size());

        boolean b = al.contains(new Alumno("Cata",6));
        System.out.println("La lista contiene a Cata = " + b);

        Object a[] = al.toArray();
        for(int i = 0; i < a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}
