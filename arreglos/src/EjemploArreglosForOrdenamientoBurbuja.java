import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void sortBurbuja (Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for(int i = 0; i < total; i++){
            for (int j = 0; j< total-1-i; j++){ //Se van restando las iteraciones
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo [j+1] = aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {


        //String[] productos = new String[4];
        String[] productos =  {"Kingstone pendrive 64GB",
                "Samsung Galaxy", "Disco Duro 500GB","Bicicleta oxford"};

        sortBurbuja(productos);

        for (int i = 0; i < productos.length; i++){
            System.out.println("producto = " + productos[i]);
        }


        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2421");
        numeros[2] = (int)31L;
        numeros[3] = 421;

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("numero = " + numeros[i]);
        }


    }
}
