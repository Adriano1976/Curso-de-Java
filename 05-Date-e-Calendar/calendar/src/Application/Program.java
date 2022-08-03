package Application;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Program {

    public static void main(String[] args) {

        // Somando uma unidade de tempo
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(simpleDateFormat1.format(date1));

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        calendar1.add(Calendar.HOUR_OF_DAY, 4);
        date1 = calendar1.getTime();

        System.out.println(simpleDateFormat1.format(date1));

        // Obtendo uma unidade de tempo
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(simpleDateFormat2.format(date2));

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        int minutes = calendar2.get(Calendar.MINUTE);
        int month = 1 + calendar2.get(Calendar.MONTH);

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}