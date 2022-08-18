package org.barrientos.datetime.ejemplo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.of(2022, Month.AUGUST, 18, 11, 20, 59);
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2022-08-18T11:25:59");
        System.out.println("fechaTiempo = " + fechaTiempo);

        LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1).plusHours(2);
        System.out.println("fechaTiempo2 = " + fechaTiempo2);
        System.out.println("fechaTiempo = " + fechaTiempo);
        System.out.println("fechaTiempo3 = " + fechaTiempo.minusHours(5));

        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);

        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia = " + dia);
        
        int anio = fechaTiempo.getYear();
        System.out.println("anio = " + anio);

        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formato1 = " + formato1);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formato2 = fechaTiempo.format(df);
        System.out.println("formato2 = " + formato2);
        
        String formato3 = df.format(fechaTiempo);
        System.out.println("formato3 = " + formato3);



    }
}
