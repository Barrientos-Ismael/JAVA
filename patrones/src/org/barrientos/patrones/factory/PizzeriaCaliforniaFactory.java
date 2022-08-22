package org.barrientos.patrones.factory;

import org.barrientos.patrones.factory.producto.PizzaCalifoniaPepperoni;
import org.barrientos.patrones.factory.producto.PizzaCalifornaVegetariana;
import org.barrientos.patrones.factory.producto.PizzaCaliforniaQueso;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCalifoniaPepperoni();
            case "vegetariana" -> new PizzaCalifornaVegetariana();
            default -> null;
        };
    }
}
