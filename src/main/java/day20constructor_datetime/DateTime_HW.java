package day20constructor_datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime_HW {
    public static void main(String[] args) {

        /*
        Task 1:

        Type the code that find out how many months Ali lived.
        Date of birth of Ali is 4th of June 1997.
        Remember When you calculate, the order is very important.

         */

        LocalDate dobAli = LocalDate.of(1997, Month.JUNE, 4);
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        long numOfMonths = ChronoUnit.MONTHS.between(dobAli,currentDate);
        System.out.println("numOfMonths = " + numOfMonths);


        /*
        Task 2:
         Tom was born 45 years, 8 months and 5 days after 29 October 1923.
         Veli was born 24 years, 2 months and 11 days before 15 September 1993.
         Type code to calculate the exact date of birth of Tom and Veli
         Type code to check if the date of birth of Tome and Veli is the same or not.

         */

        LocalDate dobTom = LocalDate.of(1923, 10,29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println("dobTom = " + dobTom);

        LocalDate dobVeli = LocalDate.of(1993, 9, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("dobVeli = " + dobVeli);

        boolean isSame = dobTom.isEqual(dobVeli);
        System.out.println(isSame);


        /*
         Task 3:
         Type code to find the time difference in hours between Japan time zone
         and Germany time zone.
         */

        LocalTime timeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInJapan = " + timeInJapan);

        LocalTime timeInGermany = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("timeInGermany = " + timeInGermany);

        System.out.println(timeInGermany.getHour() - timeInJapan.getHour());








    }
}
