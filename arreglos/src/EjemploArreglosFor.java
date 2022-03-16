import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {


        String[] productos = new String[4];
        int total = productos.length;

        productos[0] = "Kingstone pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro 500GB";
        productos[3] = "Bicicleta oxford";

        for (String prod:productos){
            System.out.println("producto = " + prod);
        }

        Arrays.sort(productos);
        System.out.println("-----------");
        for (String prod:productos){
            System.out.println("producto = " + prod);
        }

        System.out.println("-----------");
        int i = 0;
        while (i < total){
            System.out.println("productos = " + productos[i]);
            i++;
        };

        System.out.println("-----------");
        int j = 0;
        do {
            System.out.println("productos = " + productos[j]);
            j++;
        }while (j < total);
        
        int[] numeros = new int[10];
        int totalnum = numeros.length;
        for (int k=0; k<totalnum; k++){
            numeros[k] = k * 2;
            System.out.println("num = " + numeros[k]);
        }

        Arrays.sort(numeros);

    }
}
