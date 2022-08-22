package org.barrientos.patrones.decorator2;

import org.barrientos.patrones.decorator2.decorador.ConChocolateDecorador;
import org.barrientos.patrones.decorator2.decorador.ConCremaDecorador;
import org.barrientos.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe("Cafe Mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es: " + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes: " + conChocolate.getIngredientes());

        Configurable capuccino = new Cafe("Cafe Capuccino", 4);
        conCrema = new ConCremaDecorador(capuccino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuccino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes del capuccino: " + conLeche.getIngredientes());

        Configurable expresso = new Cafe("Cafe expresso", 3);
        System.out.println("El precio del cafe Expresso es " + expresso.getPrecioBase());
        System.out.println("Los ingredientes del cafe expreso son: " + expresso.getIngredientes());

    }
}
