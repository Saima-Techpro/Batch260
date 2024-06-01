package javapractice.Practice04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q03_DateTime {
    public static void main(String[] args) {

        /*
            Print current time
            Print current times' second
            Print 10000 seconds after the current time
            Print 200 minutes before the current time
         */

        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = dtf.format(currentTime);
        System.out.println("formattedTime = " + formattedTime);


        System.out.println("Time in Seconds = " + currentTime.getSecond());
        System.out.println("10000 seconds after the current time = " + dtf.format(currentTime.plusSeconds(10000)));
        System.out.println("200 minutes before the current time = " + dtf.format(currentTime.minusMinutes(200)));







    }
}
