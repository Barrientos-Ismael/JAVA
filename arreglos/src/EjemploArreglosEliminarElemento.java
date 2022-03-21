import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.println("ingrese un numero");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++ ){
            System.out.println("Pos "+ i + " => " + a[i]);
        }

        System.out.println();
        System.out.println("ingrese una posicion entre 0-9");
        int pos = s.nextInt();

        for (int i = pos; i < a.length-1; i++ ){
            a[i] = a[i+1];
        }

        int[] b = new int[a.length-1];
        System.arraycopy(a, 0, b, 0, b.length);

        for (int i = 0; i < b.length; i++){
            System.out.println("Pos "+ i + " => " + b[i]);
        }

    }
}
