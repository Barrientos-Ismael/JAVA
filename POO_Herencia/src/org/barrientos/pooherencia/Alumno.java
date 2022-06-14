package org.barrientos.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematica;
    private double notaLengua;
    private double notaHistoria;



    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
