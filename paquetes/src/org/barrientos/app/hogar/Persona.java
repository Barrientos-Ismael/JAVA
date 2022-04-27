package org.barrientos.app.hogar;

public class Persona {
    private String nombre;
    private String Apellido;
    private ColorPelo colorPelo;

    //Public solo para ejemplo
    public static final String GENERO_MASCULUNO = "Masculino";
    public static final String GENERO_FEMENIMO = "Femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarPelota(){
        return "lanzar la pelota al perro!";
    }

    public static String saludar(){
        return "Hola que tal!";
    }

}
