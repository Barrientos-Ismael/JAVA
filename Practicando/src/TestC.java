import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestC {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        int suma = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = leer.nextInt();
        while (n!=0) {
            arrayList.add(n);
            suma+=n;
            System.out.println("Ingrese otro numero");
            n = leer.nextInt();
        }
        suma/=arrayList.size();
        int extra = 0;
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i)>suma){
                extra+=(arrayList.get(i)-suma);
            }
        }
        System.out.println("output = " + extra);

    }
}
