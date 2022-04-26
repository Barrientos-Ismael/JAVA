public class EjemploAutomovilStatic {
    public static void main(String[] args) {
    //Por el momento la privacidad no la voy a utilizar por mas que rompa con el concepto de POO
        Automovil.setCapacidadTanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA ));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda","BT-70", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        //mazda.setEstanque(new Estanque());
        System.out.println("mazda.fabricante = " + mazda.getFabricante());


        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,new Motor(4.0, TipoMotor.DIESEL));
        nissan.setColor(Color.AMARILLO);
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.GRIS,new Motor(3.5, TipoMotor.BENCINA));

        System.out.println(mazda.calcularConsumo(300,70));

        Automovil auto = new Automovil();


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("kilometros por litros = " + Automovil.calcularConsumoEstatico(300,60));


        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA + "KM");
        System.out.println("Velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + "KM");

    }
}
