package day20constructor_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

     /*
     LocalTime is also a data type in Java.

     LocalTime Class uses date and time formats

            HH : mm ==> 24-hour clock system
            hh : mm ==> 12-hour clock system AM, PM not shown
            hh : mm a ==> 12-hour clock system AM, PM
            HH : mm : ss ==> shows seconds
            HH : MM ==> incorrect format because MM is used for months
            "mm" stands for "minute". "MM" stands for "month".

            dd-MM-yyyy ==> day - month - year
            MMM ==> Aug
            MMMM ==> August
      */

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime); // 20:44:11.821522  ==> 24 hrs clock

        // DateTimeFormatter class allows us to manipulate date and time
        // ofPattern() method is used to declare the pattern that we want to create in our date or tim e
        // format() method is used to format the current date and time according to the pattern that you declared in ofPattern() method


        // format time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:a");
        String formattedTime = dtf.format(currentTime);
        System.out.println("formattedTime = " + formattedTime);  // 08:47 pm

        // format the date
        LocalDate currentDate = LocalDate.now();
        System.out.println("current date = " + currentDate);  // 2024-05-29
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MMMM-dd"); // 2024-May-29
        String formattedDate = dtf1.format(currentDate);
        System.out.println("formattedDate = " + formattedDate);

        // another pattern
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println("formattedDate = " + formattedDate2);  // 29-May-2024


        // What is the time in your part of the world? => Europe, Asia, America
        LocalTime currentTimeInLondon = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("currentTimeInLondon = " + currentTimeInLondon);

        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("currentTimeInJapan = " + currentTimeInJapan);

        // Can we use local time and date together?

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);  // 2024-05-29T21:02:47.344762

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MM-yyyy - HH:mm");
        String formattedDateTime = dtf3.format(localDateTime);
        System.out.println("formattedDateTime = " + formattedDateTime); // 29-05-2024 - 21:06





    }
}
