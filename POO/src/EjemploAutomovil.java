import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
    //Por el momento la privacidad no la voy a utilizar por mas que rompa con el concepto de POO
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil("Mazda","BT-70", "rojo", 3.0);

        Automovil nissan = new Automovil("Nissan","Navara","GrisOscuro",3.5,50);
        Automovil nissan2 = new Automovil("Nissan","Navara","GrisOscuro",3.5,50);

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
