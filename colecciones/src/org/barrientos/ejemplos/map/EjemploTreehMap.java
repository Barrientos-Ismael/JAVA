package org.barrientos.ejemplos.map;

import java.util.*;

public class EjemploTreehMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new TreeMap<>((a,b) -> b.compareTo(a));
        //Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
        persona.put("Nombre", "John");
        persona.put("Apellido", "Doe");
        persona.put("ApellidoPaterno", "Doe");
        persona.put("Email", "John.doe@mail.com");
        persona.put("Edad", "30");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("Pais", "USA");
        direccion.put("Estado", "California");
        direccion.put("Ciudad", "Santa Barbara");
        direccion.put("Calle", "One Street");
        direccion.put("Numero", "120");

        persona.put("Direccion", direccion);

        System.out.println("persona = " + persona);
    }
}
