public class TestPrimitivosCaracter {
    public static void main(String[] args) {
        char simbolo = '@';
        /*Se puede checkear cualquier tipo de caracter en el mapa de caracteres */
        char charUnicode = '\u0040';
        /*codigo con decimal*/
        char charDecimal = 64;
        System.out.println("caracter: "+simbolo);
        System.out.println("caracter unicode: "+charUnicode);
        System.out.println("caracter decimal: "+charDecimal);
        System.out.println("decimal = caracter unicode: "+(charUnicode == charDecimal));
        System.out.println("decimal = simbolo: "+(simbolo == charDecimal));

        char espacio = ' '; /*en unicode \u0020 */
        char retroceso = '\b';/* Elimina un caracter, retroceso*/
        char tabulador = '\t'; /*tabulador */
        char nuevalinea = '\n'; /*salto de linea*/
        char retornoCarro = '\r'; /*otro tipo de salto dependiendo el SO */

        System.out.println("probando \t caracteres \bespecial char"+retroceso+retroceso);
        System.out.println("probando" +System.lineSeparator() +" probando 2 "+ System.getProperty("Line.separator"));

        System.out.println("character corresponde en byte = "+ Character.BYTES);
        System.out.println("character corresponde en bites = "+ Character.SIZE);
    }
}
