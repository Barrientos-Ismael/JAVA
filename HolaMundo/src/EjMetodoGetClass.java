import java.lang.reflect.Method;

public class EjMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola qué tal?";
        
        Class strClass = texto.getClass();

        System.out.println("strClass.getName = " + strClass.getName());
        System.out.println("strClass.getSimplename = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass);
        
        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());

        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
    }
}
