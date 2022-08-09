package openbootcamp.barrientos.ejercicio4;

import java.util.Scanner;

public class Ejercicio4Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // EJERCICIO IF
        System.out.println(" - IF - INGRESE UN NUMERO: ");
        int numeroIf = reader.nextInt();
        if (numeroIf > 0)
            System.out.println("Es positivo");
        else if (numeroIf < 0)
            System.out.println("Es negativo");
        else System.out.println("Es cero");

        // EJERCICIO WHILE
        System.out.println(" - WHILE - INGRESE UN NUMERO: ");
        int numeroWhile = reader.nextInt();
        while (numeroWhile < 3){
            System.out.println("Se ejecuto el while y el numero es: " + numeroWhile);
            numeroWhile++;
        }

        //EJERCICIO DO WHILE
        System.out.println(" - WHILE - INGRESE UN NUMERO: ");
        numeroWhile = reader.nextInt();
        do {
            System.out.println("Se ejecuto el Do While y el numero es: " + numeroWhile);
            numeroWhile++;
        } while(numeroWhile == 3);

        //EJERCICIO FOR
        System.out.println("- FOR -");
        for (int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println("Se ejecuto el for y el numeroFor es: " + numeroFor);
        }

        //EJERCICIO SWITCH

        System.out.println(" - SWITCH - INGRESE UNA ESTACION DEL AÑO");
        String estacion = reader.next();
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Es " + estacion);
        };




    }
}
