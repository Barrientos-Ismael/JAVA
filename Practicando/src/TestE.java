import java.util.Scanner;

public class TestE {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;
        int PROM = 0;
        int SUMA = 0;
        int cant = 0;

        n = leer.nextInt();
        while (n != 0){
            if (n < MIN) MIN = n;
            if (n > MAX) MAX = n;
            SUMA+=n;
            cant++;
            n = leer.nextInt();
        }

        PROM = SUMA / cant;

        System.out.println("MIN = " + MIN + ", MAX = "+MAX+", SUMA = "+SUMA+", PROM = "+PROM);

    }
}
