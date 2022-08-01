package org.barrientos.ejemplos.list;

import org.barrientos.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Esta vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4)); // se elimina x andres
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.peekFirst());
        System.out.println("Ultimo = " + enlazada.getLast());
        System.out.println("Indice = " + enlazada.get(2));

        //Alumno zeus = enlazada.pollFirst();
        //enlazada.pollLast();
        Alumno zeus = enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(2);
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));
        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();
        System.out.println("=======NEXT======");
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("=======PREVIOUS======");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }


    }
}
