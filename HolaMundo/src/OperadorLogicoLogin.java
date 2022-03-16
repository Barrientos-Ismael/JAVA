import java.util.Scanner;

public class OperadorLogicoLogin {
    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "ismael";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "admin2";
        passwords[2] = "12345";

        */

        String[] usernames = {"isma", "admin", "admin2"};
        String[] passwords = {"12345", "12345", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el user name");
        String u = scanner.next();

        System.out.println("ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i< usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: esAutenticado;
        }
           /* if ( (usernames[i].equals(u)) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }
        }
        */

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!"): "Username o Password es invalido\nlo siento, requiere autenticacion";
        System.out.println("mensaje = " + mensaje);
        /*
        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o Password es invalido");
            System.out.println("lo siento, requiere autenticacion");
        }
            */
    }
}
