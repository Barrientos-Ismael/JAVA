import javax.lang.model.SourceVersion;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        
        String[] productos = new String[4];
        productos[0] = "Kingstone pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro 500GB";
        productos[3] = "Bicicleta oxford";

        Arrays.sort(productos);

        String prod2 = productos[1];
        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);




        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2421");
        numeros[2] = (int)31L;
        numeros[3] = 421;
        // numeros[4] = 5;

        Arrays.sort(numeros);

        int  i = numeros[0];
        int  j = numeros[1];
        int  k = numeros[2];
        int  l = numeros[numeros.length-1];
        //int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
