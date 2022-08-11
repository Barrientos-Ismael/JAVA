package org.barrientos.java8lambda;

import org.barrientos.java8lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;

        boolean r = test.test(11);
        System.out.println("r = " + r);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(test2.test("ROLE_USER"));

        BiPredicate<String, String> test3 = String::equals;
        System.out.println(test3.test("Isma", "Isma"));

        BiPredicate<Integer, Integer> test4 = (i,j) -> j > i;
        boolean r2 = test4.test(5,10);
        System.out.println("r2 = " + r2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("Maria");
        b.setNombre("Cata");

        BiPredicate<Usuario,Usuario> test5 = (ua,ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(test5.test(a,b));


    }
}
