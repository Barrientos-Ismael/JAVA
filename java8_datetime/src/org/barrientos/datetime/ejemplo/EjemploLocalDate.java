package org.barrientos.datetime.ejemplo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());
        Month mes = fechaActual.getMonth();
        System.out.println("Mes = " + mes);
        System.out.println("Numero del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

       DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Numero del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        fechaActual = LocalDate.of(2022, 12, 25);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2022, Month.NOVEMBER, 9);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2022-02-01");
        System.out.println("fechaActual = " + fechaActual);

        LocalDate fechaManiana = LocalDate.now().plusDays(1);
        System.out.println("fechaManiana = " + fechaManiana);

        LocalDate mesAnterior = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnterior = " + mesAnterior);

        DayOfWeek jueves = LocalDate.parse("2022-08-18").getDayOfWeek();
        System.out.println("jueves = " + jueves);

        int dieciocho = LocalDate.of(2022, 8, 18).getDayOfMonth();
        System.out.println("dieciocho = " + dieciocho);

        boolean esBiciesto = LocalDate.now().isLeapYear();
        System.out.println("esBiciesto = " + esBiciesto);

        boolean esAntes = LocalDate.of(2022, 8, 17).isBefore(LocalDate.parse("2022-11-09"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2022-11-11").isAfter(LocalDate.parse("2022-11-12"));
        System.out.println("esDespues = " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
    }
    
}
