public class TestStringRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            //c+= a + b + "\n"; //500 => 18ms, 1k => 18ms, 10k => 75ms, 100k => 2828ms;
            //c= c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1k => 4ms, 10k => 137ms, 100k => 7726ms
            sb.append(a).append(b).append("\n"); //500 => 0ms, 1k => 1ms, 10k => 3ms, 100k => 12ms
        }

        System.gc();

        long fin = System.currentTimeMillis();

        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio);

        System.exit(0);


    }
}
