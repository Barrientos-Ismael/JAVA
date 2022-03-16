import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematica, claseHistoria, claseLengua;
        double sumMatematica = 0, sumHistoria = 0, sumLengua = 0;

        claseMatematica = new double[7];
        claseHistoria = new double[7];
        claseLengua = new double[7];

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para Matematica:");
        for (int i = 0; i < claseMatematica.length; i++)
            claseMatematica[i] = s.nextDouble();

        System.out.println("Ingrese 7 notas de estudiantes para Historia:");
        for (int i = 0; i < claseHistoria.length; i++)
            claseHistoria[i] = s.nextDouble();

        System.out.println("Ingrese 7 notas de estudiantes para Lengua:");
        for (int i = 0; i < claseLengua.length; i++)
            claseLengua[i] = s.nextDouble();

        for (int i = 0; i < 7; i++){
            sumMatematica +=claseMatematica[i];
            sumHistoria += claseHistoria[i];
            sumLengua += claseLengua[i];
        }

        double promMatematica = sumMatematica / claseMatematica.length;
        double promHistoria = sumHistoria / claseHistoria.length;
        double promLengua = sumLengua / claseLengua.length;

        System.out.println("Promedio clase matematica: " + promMatematica);
        System.out.println("Promedio clase historia: " + promHistoria);
        System.out.println("Promedio clase lengua: " + promLengua);
        System.out.println("Promedio total del curso:" +
                + (promMatematica+promHistoria+promLengua)/3);

        System.out.println("Ingrese el identificador del alumno (de 0-6): ");
        int id = s.nextInt();
        double promAlumno = (claseHistoria[id]+ claseLengua[id] + claseMatematica[id])/3;
        System.out.println("Promedio alumno Nro "+ id + " : " + promAlumno);




    }
}
