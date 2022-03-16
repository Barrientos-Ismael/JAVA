import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {


        //String[] productos = new String[4];
        String[] productos =  {"Kingstone pendrive 64GB",
                "Samsung Galaxy", "Disco Duro 500GB","Bicicleta oxford"};
        int total = productos.length;

        /*
        productos[0] = "Kingstone pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro 500GB";
        productos[3] = "Bicicleta oxford";
        */
        for (int i = 0; i < total; i++){
            System.out.println("producto = " + productos[i]);
        }

        for (int i = 0; i < total; i++){
            System.out.println("Para i = " + (total-1-i) + " valor " + productos[total - 1 -i]);
        }

        System.out.println("-----------");

        for (int i = total -1; i>=0;i--){
            System.out.println("productos = " + productos[i]);
        }



    }
}
