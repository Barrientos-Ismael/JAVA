package org.barrientos.patrones.decorator.decorador;

import org.barrientos.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{


    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
