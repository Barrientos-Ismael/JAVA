package org.barrientos.poointerfaces.repositorio;

import org.barrientos.poointerfaces.modelo.BaseEntity;
import org.barrientos.poointerfaces.repositorio.excepciones.*;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T>{

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) throws LecutraAccesoDatoException {
        if (id == null || id <=0 ){
            throw new LecutraAccesoDatoException("Id invalido debe ser > 0");
        }
        T resultado = null;
        for (T cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        if (resultado == null){
            throw new LecutraAccesoDatoException("No existe el registro con el id: " + id);
        }
        return resultado;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException {
        if (t == null){
            throw new EscrituraAccesoDatoException("Error al insertar un objeto null");
        }
        if (this.dataSource.contains(t)){
            throw new RegistroDuplicadoAccesoDatoException("Error el objeto con el id " + t.getId() + " existe en el repositorio.");
        }
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecutraAccesoDatoException {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public int total(){
        return this.dataSource.size();
    }
}
