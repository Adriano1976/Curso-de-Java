package applicatiion;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramV1 {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scanner.nextInt();
        System.out.print("Ckeck-in date (dd/MM/yyyy): ");
        Date ckeckIn = simpleDateFormat.parse(scanner.next());
        System.out.print("Ckeck-out date (dd/MM/yyyy): ");
        Date ckeckOut = simpleDateFormat.parse(scanner.next());

        if (!ckeckOut.after(ckeckIn)) {
            System.out.println("Error in reservation: Check-out date must be after ckeck-in date");
        } else {
            Reservation reservation = new Reservation(number, ckeckIn, ckeckOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Ckeck-in date (dd/MM/yyyy): ");
            ckeckIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Ckeck-out date (dd/MM/yyyy): ");
            ckeckOut = simpleDateFormat.parse(scanner.next());

            Date now = new Date();
            if (ckeckIn.before(now) || ckeckOut.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (!ckeckOut.after(ckeckIn)) {
                System.out.println("Error in reservation: Check-out date must be after ckeck-in date");
            } else {
                reservation.updateDates(ckeckIn, ckeckOut);
                System.out.println("Reservation: " + reservation);
            }
        }

        scanner.close();
    }
}
