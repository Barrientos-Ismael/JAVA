import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {
    //Por el momento la privacidad no la voy a utilizar por mas que rompa con el concepto de POO


        Persona conductorSubaru = new Persona ("Luci", "Martinez");

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA ));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda","BT-70", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);



        Persona bea = new Persona("Bea", "Gonzáles");
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setColor(Color.AMARILLO);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil susuki = new Automovil("Susuki","Vitara", Color.GRIS,new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
        susuki.setColor(Color.AMARILLO);
        susuki.setTipo(TipoAutomovil.SUV);
        susuki.setConductor(lalo);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano","Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = susuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }


    }
}
