package org.barrientos.app.hogar;

import org.barrientos.app.jardin.Perro;
import static org.barrientos.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
