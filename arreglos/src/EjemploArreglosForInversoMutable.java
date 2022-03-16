import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void main(String[] args) {


        //String[] productos = new String[4];
        String[] productos =  {"Kingstone pendrive 64GB",
                "Samsung Galaxy", "Disco Duro 500GB","Bicicleta oxford"};
        int total = productos.length;

        Arrays.sort(productos);

        Collections.reverse(Arrays.asList(productos));

        for (int i = 0; i < total; i++){
            System.out.println("producto = " + productos[i]);
        }

    }
}
