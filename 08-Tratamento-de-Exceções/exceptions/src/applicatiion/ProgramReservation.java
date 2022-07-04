package applicatiion;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = scanner.nextInt();
            System.out.print("Ckeck-in date (dd/MM/yyyy): ");
            Date ckeckIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Ckeck-out date (dd/MM/yyyy): ");
            Date ckeckOut = simpleDateFormat.parse(scanner.next());

            Reservation reservation = new Reservation(number, ckeckIn, ckeckOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            ckeckIn = simpleDateFormat.parse(scanner.next());
            System.out.print("Check-out date (dd/mm/yyyy): ");
            ckeckOut = simpleDateFormat.parse(scanner.next());

            reservation.updateDates(ckeckIn, ckeckOut);
            System.out.println("Reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format");

        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("Unexpected error");

        }

        scanner.close();
    }
}
