public class EjemploAutomovilEnum {
    public static void main(String[] args) {
    //Por el momento la privacidad no la voy a utilizar por mas que rompa con el concepto de POO
        Automovil.setCapacidadTanqueEstatico(45);

        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.PICKUP);

        Automovil mazda = new Automovil("Mazda","BT-70", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo subaru: "+ tipoSubaru.getNombre());
        System.out.println("tipo desc. subaru: "+ tipoSubaru.getDescripcion());

        switch (tipoSubaru){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil mas grande, maleta grande...");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.print(ta + " --> " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }

    }
}
