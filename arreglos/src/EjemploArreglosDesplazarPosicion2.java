import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int [] a = new int [10];
        int elem,pos;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }

        System.out.print("nuevo elemento: ");
        elem = s.nextInt();
        System.out.print("en la posicion: ");
        pos = s.nextInt();

        for (int i = a.length-2 ; i >= pos ; i--){
            a[i+1] = a[i];
        }

        a[pos]=elem;

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }



    }
}
