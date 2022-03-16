import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSistemaNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");

        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e){ //Asegurarse el tipo de error, realizar la exception, en este caso se importa
            System.out.println("error, debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = "+ numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexa = "numero hexadecimal de "+ numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje +="\n" + resultadoHexa;

        System.out.println(mensaje);

    }
}
