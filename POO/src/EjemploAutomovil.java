import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
    //Por el momento la privacidad no la voy a utilizar por mas que rompa con el concepto de POO
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda","BT-70", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));

        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,new Motor(4.0, TipoMotor.DIESEL),new Estanque(45));
        nissan.setColor(Color.AMARILLO);
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.GRIS,new Motor(3.5, TipoMotor.BENCINA),new Estanque(50));


        Automovil auto = new Automovil();
        Date fecha = new Date();

        System.out.println("Son iguales?: "+ (nissan == nissan2));
        System.out.println("Son iguales?: "+ nissan.equals(nissan2));


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(auto.equals(nissan));

        System.out.println(auto.equals(fecha));
        System.out.println(nissan); //implicita
        System.out.println(nissan.toString()); //explicita

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilometros por litro: " + nissan.calcularConsumo(300,60));


    }
}
