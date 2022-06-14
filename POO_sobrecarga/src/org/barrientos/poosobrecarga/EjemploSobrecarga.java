package org.barrientos.poosobrecarga;
import static org.barrientos.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        //Calculadora cal = new Calculadora();

        System.out.println("Sumar int: "+ sumar(10, 5));
        System.out.println("Sumar float: "+ sumar(10.0f, 5F));
        System.out.println("sumar float - int: " + Calculadora.sumar(10f, 5));
        System.out.println("sumar int - float: " + Calculadora.sumar(10, 5f));
        System.out.println("sumar double: "+Calculadora.sumar(10.0,5.0));
        System.out.println("sumar String: "+Calculadora.sumar("10","5"));
        System.out.println("sumar 3 enteros: "+Calculadora.sumar(10,5,3));
        System.out.println("sumar 4 enteros: "+Calculadora.sumar(10,5,3,4));
        System.out.println("sumar 5 enteros: "+Calculadora.sumar(10,5,3,4,6));
        System.out.println("sumar float + n int: "+Calculadora.sumar(10F,5,3,4,6));
        System.out.println("sumar double: "+Calculadora.sumar(10.0,5.0,3.5,4,6));

        System.out.println("sumar long: " + Calculadora.sumar(10L,5L));
        System.out.println("sumnar int: " + Calculadora.sumar(10, '@')); //Toma el valor del ascii @
        System.out.println("sumar float-int: "+Calculadora.sumar(10F, '@'));

    }
}
