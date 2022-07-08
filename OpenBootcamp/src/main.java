public class main {
    public static void main(String[] args) {
        System.out.println("-- PARTE 1 ---");
        int a = 5;
        int b = 10;
        int c = 15;
        System.out.println(suma(a,b,c));

        System.out.println("-- PARTE 2 ---");

        Coche miCoche = new Coche();
        automovil.incrementarPuertas();
        System.out.println(automovil.getPuertas());

    }

    public static int suma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

class Coche {
        private int numPuertas = 0;

        public void incrementarPuertas(){
            this.numPuertas++;
        }

        public int getPuertas(){
            return numPuertas;
        }
}
