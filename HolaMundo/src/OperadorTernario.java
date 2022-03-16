import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 7 ? "si es verdadero": "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematica = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("ingrese la nota de matematica entre 2.0 - 7.0:");
        matematica = s.nextDouble();

        System.out.println("ingrese la nota de ciencias entre 2.0 - 7.0:");
        ciencias = s.nextDouble();

        System.out.println("ingrese la nota de historia entre 2.0 - 7.0:");
        historia = s.nextDouble();

        promedio = (matematica+ ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "aprobado": "rechazado";

        System.out.println("estado = " + estado);
        System.out.println("promedio = " + promedio);
    }
}
