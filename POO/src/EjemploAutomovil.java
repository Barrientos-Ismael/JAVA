public class EjemploAutomovil {
    public static void main(String[] args) {

    //Por el momento la privacidad no la voy a utilizar por mas que rompa con el concepto de POO
    Automovil subaru = new Automovil();

    subaru .fabricante = "Subaru";
    subaru .modelo = "Impreza";
    subaru .cilindrada = 2.0;
    subaru .color = "blanco";

    Automovil mazda = new Automovil();
    mazda.fabricante = "Mazda";
    mazda.modelo = "BT-70";
    mazda.cilindrada = 3.0;
    mazda.color = "rojo";


        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
    
    }
}
