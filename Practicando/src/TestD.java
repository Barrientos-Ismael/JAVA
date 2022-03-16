public class TestD {
    public static void main(String[] args) {

        String cadena1 = "HolaMundo";

        String a = cadena1;
        String b = a.concat(cadena1);

        String cadena2 = "Mundo";

        System.out.print("¿La segunda palabra esta contenida en la primera? ");
        System.out.println(b.contains(cadena2));

    }
}
