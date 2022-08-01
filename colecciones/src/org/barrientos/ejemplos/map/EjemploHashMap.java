package org.barrientos.ejemplos.map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos = "  + !persona.isEmpty());
        persona.put(null, "12345");
        persona.put("Nombre", "John");
        persona.put("Apellido", "Doe");
        persona.put("ApellidoPaterno", "Doe");
        persona.put("Email", "John.doe@mail.com");
        persona.put("Edad","30");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("Pais", "USA");
        direccion.put("Estado","California");
        direccion.put("Ciudad","Santa Barbara");
        direccion.put("Calle", "One Street");
        direccion.put("Numero","120");

        persona.put("Direccion", direccion);

        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("Nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("Apellido");
        System.out.println("apellido = " + apellido);

        Map<String,String> direccionPersona = (Map<String, String>) persona.get("Direccion");
        String pais = direccionPersona.get("Pais");
        String ciudad = direccionPersona.get("Ciudad");
        String barrio = direccionPersona.getOrDefault("Barrio", "La Playa");
        System.out.println("El Pais de "  + nombre + " es " + pais);
        System.out.println("La Ciudad de "  + nombre + " es " + ciudad);
        System.out.println("El Barrio de "  + nombre + " es " + barrio);

        System.out.println("-----------------------");
        //String valorApellido = persona.remove("ApellidoPaterno", "Doe");
        Boolean b = persona.remove("ApellidoPaterno", "Doe");
        System.out.println("Eliminado = " + b);
        System.out.println("Persona = " + persona);
        System.out.println("-----------------------");
        boolean b2 = persona.containsKey("ApellidoPaterno");
        System.out.println("b2 = " + b2);
        System.out.println("-----------------------");
        b2 = persona.containsValue("Doe");
        System.out.println("b2 = " + b2);
        System.out.println("-----------------------");
        Collection<Object> valores = persona.values();
        valores.forEach(System.out::println);
        System.out.println("-----------------------  ");
        Set<String> keys = persona.keySet();
        keys.forEach(System.out::println);
        System.out.println("----------------------- ENTRYSET ");
        for(Map.Entry<String, Object> per: persona.entrySet()){
            Object valor = per.getValue();
            if (valor instanceof Map) {
                Map<String,String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String,String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            } else {
                System.out.println(per.getKey() + " => " + valor);
            }
        }
        System.out.println("----------------------- KEYSET");
        for(String llave: persona.keySet()) {
            Object valor = persona.get(llave);
            if (valor instanceof Map) {
                Map<String,String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de "+ persona.get("Nombre") + ": " + direccionMap.get("Pais"));
                System.out.println("La ciudad de " + persona.get("Nombre") + ": " + direccionMap.get("Ciudad"));
                System.out.println("El Barrio de " + persona.get("Nombre") + ": " + direccionMap.get("Barrio"));
            } else {
                System.out.println(llave + " --> " + valor);
            }
        }
        System.out.println("----------------------- JAVA 8 FOREACH");
        persona.forEach((llave,valor) -> {
            System.out.println(llave + " --> " + valor);
        });

        System.out.println("total: " + persona.size());
        System.out.println("Contiene elementos = "  + !persona.isEmpty());

        persona.replace("Nombre", "John","Ismael");
        System.out.println("persona = " + persona);

    }
}
