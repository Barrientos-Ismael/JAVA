public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    //No es buena practica imprimir dentro de los metodos
    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();
    }

}
