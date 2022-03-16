public class TestStringMetodos {
    public static void main(String[] args) {

        String nombre = "Ismael";

        System.out.println("nombre.lenght() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = "+ nombre.toLowerCase());
        System.out.println("nombre.equals(\"ismael\") = " + nombre.equals("ismael"));
        System.out.println("nombre.equals(\"Ismael\") = " + nombre.equals("Ismael"));
        System.out.println("nombre.equalsIgnoreCase(\"ismael\") = "+ nombre.equalsIgnoreCase("ismael"));
        System.out.println("nombre.compareTo(\"Ismael\") = " + nombre.compareTo("Ismael"));
        System.out.println("nombre.compareTo(\"Israel\") = " + nombre.compareTo("Israel"));
        System.out.println("nombre.charAt() = " + nombre.charAt(0));
        System.out.println("nombre.charAt() = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.lenght()-1) = " + nombre.charAt(nombre.length()-1)); // Sin -1 da error porque lenght (6) cuando el charAt empieza en 0
        System.out.println("nombre.subString(4,6) = " + nombre.substring(4,6));
        
        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas.replace(\"a\",\".\" = " + trabaLenguas.replace("a","."));
        System.out.println("trabaLenguas.indexOf(\"a\") = " + trabaLenguas.indexOf("a"));
        System.out.println("trabaLenguas.lastIndexOf(\"a\") = " + trabaLenguas.lastIndexOf("a"));
        System.out.println("trabaLenguas.indexOf(\"z\") = " + trabaLenguas.indexOf("lenguas"));
        System.out.println("trabaLenguas.contains(\"t\") = " + trabaLenguas.contains("lenguas"));
        System.out.println("trabaLenguas.startsWith(\"traba\") = " + trabaLenguas.startsWith("traba"));
        System.out.println("trabaLenguas.endsWith(\"lenguas\") = " + trabaLenguas.endsWith("lenguas"));
        System.out.println("   trabalenguas       ");
        System.out.println("   trabalenguas       ".trim()); //quita los espacios


    }
}
