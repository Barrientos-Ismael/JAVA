import java.util.Scanner;

public class TestB {

    public static int FibonacciRecursivo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else return FibonacciRecursivo(n - 1) + FibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limit = leer.nextInt();

        int num1 = 0;
        int num2 = 0;

        int ant = 0;
        int act = 1;
        int sig = 1;

        System.out.println("No recursiva:");
        for (int i = 1; i<=limit; i++){
            System.out.print(act);
            if (i==limit) num1 = act;
            else System.out.print(", ");
            ant=act;
            act=sig;
            sig+=ant;
        };
        System.out.println("\nRecursiva: ");
        for (int i = 1; i<=limit; i++) {
            System.out.print(FibonacciRecursivo(i));
            if (i==limit) num2 = FibonacciRecursivo(i);
            else System.out.print(", ");
        }

        System.out.println("\nMetodo Recursivo: "+num2+", Metodo no Recursivo: "+num1);

    }
}
