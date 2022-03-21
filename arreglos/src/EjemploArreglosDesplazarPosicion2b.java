import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

        int [] a = new int [10];
        int elem,pos, ult;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }

        System.out.print("nuevo elemento: ");
        elem = s.nextInt();
        System.out.print("en la posicion: ");
        pos = s.nextInt();

        ult = a[a.length-1];

        for (int i = a.length-2 ; i >= pos ; i--){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        a = b;
        a[pos] = elem;
        a[b.length-1] = ult;

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }



    }
}
