package org.barrientos.patrones.decorator.decorador;

import org.barrientos.patrones.decorator.Formateable;

public abstract class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }



}
