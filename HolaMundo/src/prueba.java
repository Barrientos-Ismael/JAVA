import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Radio de un circulo");
        double r = scanner.nextDouble();
        double area = Math.PI * Math.pow(r,2);
        System.out.println("area = " + area);

    }
}
