package org.barrientos.genericsclass;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion){
        for(T t: camion){
            if (t instanceof Animal) {
                System.out.println(((Animal)t).getNombre() + ", tipo: " + ((Animal)t).getTipo());
            } else if (t instanceof Maquinaria){
                System.out.println(((Maquinaria)t).getTipo());
            } else if (t instanceof Automovil){
                System.out.println(((Automovil)t).getMarca());
            }

        }
    }


    public static void main(String[] args) {

        Camion<Animal> transporteCaballo = new Camion<>(5);
        transporteCaballo.add(new Animal("Peregrino", "Caballo"));
        transporteCaballo.add(new Animal("Grillo","Caballo"));
        transporteCaballo.add(new Animal("Tunquen","Caballo"));
        transporteCaballo.add(new Animal("Topocalma", "Caballo"));
        transporteCaballo.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballo);

        Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grua Horquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transporteMaquinas);

        Camion<Automovil> transporteAuto = new Camion<>(2);
        transporteAuto.add(new Automovil("Toyota"));
        transporteAuto.add(new Automovil("Ford"));

        imprimirCamion(transporteAuto);

    }
}
