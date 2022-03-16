public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String ... que tal!";

        Number num = 7; // Integer.valueOf("7")

        Boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("Num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("Num es del tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("Num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("Num es del tipo Double = " + b1);

        Number decimal = 45.54f;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double= " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float= " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 = " + b1);

    }
}
