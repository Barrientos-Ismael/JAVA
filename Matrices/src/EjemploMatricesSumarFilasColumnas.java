public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {

        int sumafila, sumacolumna;

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for(int i = 0; i < a.length; i++){
            sumacolumna = 0;
            sumafila = 0;
            for (int j = 0; j < a[i].length; j++){
               sumafila+=a[i][j];
               sumacolumna+=a[j][i];
            }
            System.out.println("Total fila: "+i+": "+sumafila);
            System.out.println("Total columna: "+i+": "+sumacolumna);
        }


    }
}
