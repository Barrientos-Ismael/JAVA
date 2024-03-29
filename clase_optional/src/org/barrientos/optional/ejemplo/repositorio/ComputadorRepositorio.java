package org.barrientos.optional.ejemplo.repositorio;

import org.barrientos.optional.ejemplo.models.Computador;
import org.barrientos.optional.ejemplo.models.Fabricante;
import org.barrientos.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador>{

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador procesador = new Procesador("I9-9888H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus Rog", "Strix G512");
        asus.setProcesador(procesador);
        dataSource.add(asus);
        dataSource.add(new Computador("Macbook Pro", "MVVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream()
                .filter(c ->c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
        /*
        for (Computador c: dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
         */
    }
}
