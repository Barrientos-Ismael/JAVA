import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {

        int[] a = new int [7];
        int num, pos, ult;
        Scanner s = new Scanner (System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese un numero a insertar");
        num = s.nextInt();

        ult = a[a.length-1];

        pos = 0;
        while (pos<6 && num > a[pos]){
            pos++;
        }

        for (int i = a.length-2; i >= pos; i--){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);

        if (num > ult) b[b.length - 1] = num;
        else {
            b[b.length-1] = ult;
            b[pos] = num;
        }

        System.out.println("El nuevo arreglo ordenado");


        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }

    }
}
