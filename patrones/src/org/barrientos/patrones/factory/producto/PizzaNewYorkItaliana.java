package org.barrientos.patrones.factory.producto;

import org.barrientos.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano y carne";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30min. a 120ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");

    }
}
