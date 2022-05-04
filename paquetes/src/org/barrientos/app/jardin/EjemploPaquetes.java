package org.barrientos.app.jardin;
import org.barrientos.app.hogar.*;
import static org.barrientos.app.hogar.Persona.*;
import static org.barrientos.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Ismael");
        p.setColorPelo(CAFE);
        System.out.println("nombre: " + p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);

        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENIMO;
        String generoHombre = GENERO_MASCULUNO;

    }
}
