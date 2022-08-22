package org.barrientos.patrones.factory.producto;

import org.barrientos.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate y rucula";
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso Azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35min. a 100ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");

    }
}
