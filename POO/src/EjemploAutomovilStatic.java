public class EjemploAutomovilStatic {
    public static void main(String[] args) {
    //Por el momento la privacidad no la voy a utilizar por mas que rompa con el concepto de POO
        Automovil.setColorPatente("Verde");

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil("Mazda","BT-70", "rojo", 3.0);

        Automovil nissan = new Automovil("Nissan","Navara","GrisOscuro",3.5,50);
        Automovil nissan2 = new Automovil("Nissan","Navara","GrisOscuro",3.5,50);


        Automovil auto = new Automovil();


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());


    }
}
