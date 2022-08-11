package org.barrientos.java8lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> funcion1 = param -> "Hola que tal! " + param;
        String resultado = funcion1.apply("Ismael");
        System.out.println(resultado);

        Function<String, String> funcion2 = param -> param.toUpperCase();
        System.out.println(funcion2.apply("ismael"));

        BiFunction<String,String,String> funcion3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String resultado2 = funcion3.apply("IsMaEl","_BarRiEnTos");
        System.out.println(resultado2);

        //BiFunction<String,String,Integer> funcion4 = (a,b) -> a.compareTo(b);
        BiFunction<String,String,Integer> funcion4 = String::compareTo;
        System.out.println(funcion4.apply("Ismael", "Ismael"));

        BiFunction<String,String,String> funcion5 = String::concat;
        System.out.println(funcion5.apply("Ismael", "_Barrientos"));


    }
}
