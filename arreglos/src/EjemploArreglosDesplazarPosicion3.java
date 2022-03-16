import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] a = new int [7];
        int num, pos;
        Scanner s = new Scanner (System.in);

        for(int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese un numero a insertar");
        num = s.nextInt();
        pos = 0;
        while (pos<6 && num > a[pos]){
            pos++;
        }

        for (int i = a.length-2; i >= pos; i--){
            a[i+1] = a[i];
        }

        a[pos] = num;

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
