package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

    public static void main(String[] args) throws ParseException {

        // Define formatos para conversão entre Date e String
        SimpleDateFormat simpleDataFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());
        Date date3 = new Date(0L);
        Date date4 = new Date(1000L * 60L * 60L * 5L);

        Date date5 = simpleDataFormat1.parse("25/06/2018");
        Date date6 = simpleDateFormat2.parse("25/06/2018 15:42:07");

        // Padrão ISO 8601 e classe Instant
        Date date7 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("\n----------------------------------------\n");

        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        System.out.println("date3: " + date3);
        System.out.println("date4: " + date4);
        System.out.println("date5: " + date5);
        System.out.println("date6: " + date6);
        System.out.println("date7: " + date7);

        System.out.println("\n----------------------------------------\n");

        System.out.println("date1: " + simpleDateFormat2.format(date1));
        System.out.println("date2: " + simpleDateFormat2.format(date2));
        System.out.println("date3: " + simpleDateFormat2.format(date3));
        System.out.println("date4: " + simpleDateFormat2.format(date4));
        System.out.println("date5: " + simpleDateFormat2.format(date5));
        System.out.println("date6: " + simpleDateFormat2.format(date6));
        System.out.println("date7: " + simpleDateFormat2.format(date7));

        System.out.println("\n----------------------------------------\n");

        System.out.println("date1: " + simpleDateFormat3.format(date1));
        System.out.println("date2: " + simpleDateFormat3.format(date2));
        System.out.println("date3: " + simpleDateFormat3.format(date3));
        System.out.println("date4: " + simpleDateFormat3.format(date4));
        System.out.println("date5: " + simpleDateFormat3.format(date5));
        System.out.println("date6: " + simpleDateFormat3.format(date6));
        System.out.println("date7: " + simpleDateFormat3.format(date7));
    }
}