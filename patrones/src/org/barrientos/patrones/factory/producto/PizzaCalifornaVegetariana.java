package org.barrientos.patrones.factory.producto;

import org.barrientos.patrones.factory.PizzaProducto;

public class PizzaCalifornaVegetariana extends PizzaProducto {

    public PizzaCalifornaVegetariana() {
        super();
        nombre = "Pizza California Vegetariana";
        masa = "Masa delgada light";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20min. a 180ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
