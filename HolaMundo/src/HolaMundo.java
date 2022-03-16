public class HolaMundo {
    public static void main(String[] args) {
        
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;
        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        var numero3 = "15";
        System.out.println("numero2= " + numero2);

        String nombre;

        nombre = "Ismael";

        if(numero>10){
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 5;



      /*  System.out.println("Hola Mundo desde Java");
        
        TipoDato nombreVariable;

        int numero;
        int numero = 10;
        Integer numero = 10;
        String nombre = "Andres";
        Usuario usuario = new Usuario("Andres");


         CLASE
         tipos primitivos
LOGICO
         boolean a = false; //1 bit
         boolean b = true;
CARACTER
         char a = 'a'; //16 bits
         char b = 'b';
         char b = \u0021';
         (ej \b retroceso)

ENTEROS
         byte enteroByte = 127; + -
         short enteroShort = 32767; + -
         int enteroInt = 2147483647; + -
         long enteroLong = 9223372036854775807L; + -

REALES
         float realFloat = 3.1416f;
         double realDouble = 4.7029235E3;

NOMBRES DE VARIABLES

         abstract,continue,for,new,null
         switch,boolean,default,goto,package,
         synchronized,break,do,if,private
         this,byte,double,implements,protected
         threadsafe,byvalue,else,import,public
         throw,case,extends,instanceof,return
         transient,catch,false,int,short
         true,char,final,interface,static
         try,class,finally,long,super
         void,const,float,native,while
         
       */




    }
}
