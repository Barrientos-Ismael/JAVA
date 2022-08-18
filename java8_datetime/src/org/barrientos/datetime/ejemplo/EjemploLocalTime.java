package org.barrientos.datetime.ejemplo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());

        LocalTime seisConTreinta = LocalTime.of(6, 30, 59);
        System.out.println("seisConTreinta = " + seisConTreinta);
        seisConTreinta = LocalTime.parse("06:30");
        System.out.println("seisConTreinta = " + seisConTreinta);

        LocalTime sieteConTreita = LocalTime.of(6,30).plus(1, ChronoUnit.HOURS);
        System.out.println("sieteConTreita = " + sieteConTreita);

        boolean esAnterior = LocalTime.of(6,30, 59).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String ahoraFormateado = ahora.format(df);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
        String seisConTreintaFormateado = seisConTreinta.format(df);
        System.out.println("seisConTreintaFormateado = " + seisConTreintaFormateado);

        ahoraFormateado = df.format(ahora);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
        
        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
    
}
