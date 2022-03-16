import java.util.Scanner;

public class TestF {
    public static void main(String[] args) {

         int cant100 = 0, cant50 = 0, cant20 =0,
                cant10 = 0, cant5 = 0, cant2 = 0,
                cant1=0, cant050=0, cant025=0, cant010=0,
                cant005=0, cant001=0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Monto a Pagar: ");
        double aPagar = leer.nextDouble();

        System.out.println("Monto: ");
        double monto = leer.nextDouble();

        monto = monto - aPagar;
        int CantGeneral = 0;

        while (monto > 0){
            System.out.println("entro");
            if (CantGeneral <= cant100 && monto >= 100 ) {
                monto-=100;
                cant100++;
            }
            else if (CantGeneral <= cant50 && monto >= 50 ) {
                cant50++;
                monto-=50;
                 }
                else if (CantGeneral <= cant20 && monto >= 20 ) {
                    cant20++;
                    monto-=20;
                    }
                    else if (CantGeneral <= cant10 && monto >= 10) {
                        cant10++;
                        monto-=10;
                        }
                        else if (CantGeneral <= cant5 && monto >= 5 ) {
                            cant5++;
                            monto-=5;
                            }
                            else if (CantGeneral <= cant2 && monto >= 2 ) {
                                cant2++;
                                monto-=2;
                                }
                                else if (CantGeneral <= cant1 && monto >= 1 ) {
                                    cant1++;
                                    monto-=1;
                                    }
                                    else if (CantGeneral <= cant050 && monto >= 0.50 ) {
                                        cant050++;
                                        monto-=0.50;
                                        }
                                        else if (CantGeneral <= cant025 && monto >= 0.25 ) {
                                            cant025++;
                                            monto-=0.25;
                                            }
                                            else if (CantGeneral <= cant010 && monto >= 0.10 ) {
                                                cant010++;
                                                monto-=0.10;
                                                }
                                                else if (CantGeneral <= cant005 && monto >= 0.05 ) {
                                                    cant005++;
                                                    monto-=0.05;
                                                    }
                                                    else if (CantGeneral <= cant001 && monto >= 0.001 ) {
                                                        cant001++;
                                                        monto-=0.01;
                                                        }
                                                        else CantGeneral++;
        }

        System.out.println("CantGeneral = " + CantGeneral);
        System.out.println("100 = "+cant100);
        System.out.println("50 = "+cant50);
        System.out.println("20 = "+cant20);
        System.out.println("10 = "+cant10);
        System.out.println("5 = "+cant5);
        System.out.println("2 = "+cant2);
        System.out.println("1 = "+cant1);
        System.out.println("0.50 = "+cant050);
        System.out.println("0.25 = "+cant025);
        System.out.println("0.10 = "+cant010);
        System.out.println("0.05 = "+cant005);
        System.out.println("0.01 = "+cant001);



    }
}
