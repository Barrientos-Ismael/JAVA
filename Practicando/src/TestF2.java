import java.util.Scanner;

public class TestF2 {
    public static void main(String[] args) {

        double moneda [] = {100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.1, 0.05 ,0.01};
        int cant [] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Scanner leer = new Scanner(System.in);

        System.out.println("Monto a Pagar: ");
        double aPagar = leer.nextFloat();

        System.out.println("Monto: ");
        double monto = leer.nextFloat();

        monto-= aPagar;

        int CantGeneral = 0;
        double montoAnt;
        int i;

        while (monto > 0){
            i = 0;
            montoAnt = monto;
            while (i < moneda.length && montoAnt == monto){
                if (CantGeneral <= cant[i] && monto >= moneda[i] ) {
                    if (moneda [i] >= 1) {
                        int m = (int) moneda[i];
                        monto-=m;
                    } else monto-= moneda[i];
                    cant[i]++;
                };
                i++;
            };
            if (i >= cant.length) CantGeneral++;
        };

        System.out.println("CantGeneral = " + CantGeneral);
        System.out.println("100 = "+cant[0]);
        System.out.println("50 = "+cant[1]);
        System.out.println("20 = "+cant[2]);
        System.out.println("10 = "+cant[3]);
        System.out.println("5 = "+cant[4]);
        System.out.println("2 = "+cant[5]);
        System.out.println("1 = "+cant[6]);
        System.out.println("0.50 = "+cant[7]);
        System.out.println("0.25 = "+cant[8]);
        System.out.println("0.10 = "+cant[9]);
        System.out.println("0.05 = "+cant[10]);
        System.out.println("0.01 = "+cant[11]);
    }
}
