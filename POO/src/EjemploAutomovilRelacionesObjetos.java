public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
    //Por el momento la privacidad no la voy a utilizar por mas que rompa con el concepto de POO


        Persona conductorSubaru = new Persona ("Luci", "Martinez");

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA ));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        };



        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazda","BT-70", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);
        Rueda[] ruedasMaz = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++){
            mazda.addRueda(new Rueda("Michelin", 10, 10.5));
        };


        Persona bea = new Persona("Bea", "Gonzáles");
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setColor(Color.AMARILLO);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
        .addRueda(new Rueda("Pirelli", 20, 11.5))
        .addRueda(new Rueda("Pirelli", 20, 11.5))
        .addRueda(new Rueda("Pirelli", 20, 11.5))
        .addRueda(new Rueda("Pirelli", 20, 11.5));

        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};
        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan","Navara", Color.GRIS,new Motor(3.5, TipoMotor.BENCINA), new Estanque(50), lalo, ruedasNissan2);


        System.out.println(mazda.calcularConsumo(300,70));

        Automovil auto = new Automovil();


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        /*System.out.println("Conductor Subaru: " + subaru.getConductor());
        System.out.println("Ruedas Subaru: ");
        for(Rueda r: subaru.getRuedas()) System.out.println(r.getMarca() + ", aro: "+ r.getAro() + ", ancho: " + r.getAncho());
        */


    }
}
