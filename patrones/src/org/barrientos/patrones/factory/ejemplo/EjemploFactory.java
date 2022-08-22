package org.barrientos.patrones.factory.ejemplo;

import org.barrientos.patrones.factory.PizzaProducto;
import org.barrientos.patrones.factory.PizzeriaCaliforniaFactory;
import org.barrientos.patrones.factory.PizzeriaNewYorkFactory;
import org.barrientos.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Ismael ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andres ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);

    }
}
