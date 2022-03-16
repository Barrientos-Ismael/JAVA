public class TestStringConcatenar {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Guzman";

        String detalle = curso + "con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + numeroA + numeroB); //Concatena dependiendo el dato precedente
        System.out.println(detalle + (numeroA + numeroB)); //Separa el orden de precedencia
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" ".concat(profesor));
        System.out.println(detalle2);
    }
}
