package org.barrientos.recursividad.ejemplo;

import org.barrientos.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente poder 700w");
        Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("Cpu AMD Ryzen 5 2000");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvida RTX 3800 8GB");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentilador = new Componente("Ventilador");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente("Disco SDD 2T");

        cpu.addComponente(ventilador)
                .addComponente(disipador);
        tv.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentilador);
        placaMadre.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);
        pc.addComponente(poder)
                .addComponente(placaMadre)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

    metodoRecursivoJava8(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));

    }
    public static Stream<Componente> metodoRecursivoJava8 (Componente c, int nivel){
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap( hijo -> metodoRecursivoJava8(hijo, nivel + 1)));
    }

    public static void metodoRecursivo (Componente c, int nivel){
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if (c.tieneHijos()){
            for (Componente hijo: c.getHijos()){
                metodoRecursivo(hijo, nivel+1);
            }
        }
    }
}
