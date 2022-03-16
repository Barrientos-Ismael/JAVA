import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.awt.*;

public class TestSistemaNumericos {
    public static void main(String[] args) {
    /*
            int numeroDecimal = 500;
        System.out.println("numeroDecimal = "+ numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario = 0b111110100; // 0b para que java sepa que es binario
        System.out.println("numeroBinario = "+numeroBinario);

        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; //anteponiendo 0 se dice que es octal
        System.out.println("numeroOctal = "+ numeroOctal);

        System.out.println("numero hexadecimal de "+ numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; //antepones 0x para demostrar que es hex
        System.out.println("numeroHex = "+ numeroHex);


    */

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr) ;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"error, debe ingresar un numero entero");
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
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
