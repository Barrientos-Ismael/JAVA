public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizEnteros = {
                {32, 90, 3, 312},
                {213,15,123,12},
                {123,534,12,542}
        };

        int elementoBuscar = 12;
        boolean encontrado = false;
        int i=0, j=0;

        buscar:for(i = 0; i < matrizEnteros.length; i++){
            for (j = 0; j < matrizEnteros[i].length; j++) {
                if (matrizEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("Encontrado "+elementoBuscar + " en las cordenadas: [" + i + "] [" + j +"]");
        } else {
            System.out.println("No se encontro en la matriz");
        }

    }
}
