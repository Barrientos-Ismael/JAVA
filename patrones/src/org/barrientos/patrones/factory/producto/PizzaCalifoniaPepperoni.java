package org.barrientos.patrones.factory.producto;

import org.barrientos.patrones.factory.PizzaProducto;

public class PizzaCalifoniaPepperoni extends PizzaProducto {

    public PizzaCalifoniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa a la piedra gruesa";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra Queso mozzarella");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50min. a 55ªC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
