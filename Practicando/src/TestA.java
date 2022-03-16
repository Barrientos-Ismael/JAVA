import java.util.Scanner;
import java.util.Stack;

public class TestA {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String cadena = leer.next();

        char cadena_letras [] = cadena.toCharArray();
        Stack<Character> pila = new Stack<Character>();

        for (int i=0; i< cadena_letras.length; i++){
            switch (cadena_letras[i]){
                case '(': pila.push(cadena_letras[i]);
                case '[': pila.push(cadena_letras[i]);
                case ')': {
                    if (!pila.isEmpty() && pila.peek() != ')') {
                        pila.pop();
                    } else pila.push(cadena_letras[i]);
                };
                case ']':{
                    if (!pila.isEmpty() && pila.peek() != ']'){
                        pila.pop();
                    } else pila.push(cadena_letras[i]);
                };
            }
        }

        if (pila.isEmpty()) {
            System.out.println("Es Balanceado");
        } else System.out.println("No es Balanceado");

    }
}

