package day20constructor_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
   // Date is a data type itself

   // Example: Type code to get today's date
        // now() method returns today's date from your computer's system

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);  // 2024-05-29

        // get the value of the month
        int month =currentDate.getMonthValue();
        System.out.println("month = " + month); // 5

        Month monthName = currentDate.getMonth();
        System.out.println("monthName = " + monthName);  // MAY
        System.out.println("Day Of Month = " + currentDate.getDayOfMonth());  // 29
        // Month is Enum data type => it's a structure that stores constant values such as names of the months, names of days, names of the countries etc.

        // get the value of the year
        System.out.println("Year = " + currentDate.getYear()); // 2024
        System.out.println(Year.now());  // 2024  =>  Year is Enum data type
        int dayOfYear = currentDate.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);  // 150

        // get the value of the week
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();  // DayOfWeek is enum data type
        System.out.println("dayOfWeek = " + dayOfWeek);  // WEDNESDAY

        // Example 2: How to get future day, month and year
        // To go to future, we have plusMonth(), plusDay(), and plusYear() methods

       LocalDate futureDate = currentDate.plusYears(1).plusMonths(4).plusDays(1);
       System.out.println("futureDate = " + futureDate); // currentDate = 2024-05-29 => futureDate = 2025-09-30

        // Example 3: How to get past day, month and year

        LocalDate pastDate = currentDate.minusYears(10).minusMonths(2).minusDays(2);
        System.out.println("pastDate = " + pastDate);  // currentDate = 2024-05-29 => pastDate = 2014-03-27

        // Example 4: Get the specific date based on given information
        LocalDate date1 = LocalDate.of(1990, 06, 14);
        System.out.println("date1 = " + date1);  // 1990-06-14

        LocalDate date2 = LocalDate.of(2090, 10, 24);
        System.out.println("date2 = " + date2); // 2090-10-24

        System.out.println(date1.isBefore(date2));  // true
        System.out.println(date1.isAfter(date2)); // false
        System.out.println(date1.getDayOfWeek());  // THURSDAY


        // Example: Ask user to enter a date. Print "Invalid date" if the date entered bby user
        // is from past. Otherwise, welcome the user to their account

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the date in year-month-day pattern");
        int yearValue = scan.nextInt();
        int monthValue = scan.nextInt();
        int dayValue = scan.nextInt();
        LocalDate userDate = LocalDate.of(yearValue, monthValue, dayValue);
        System.out.println("userDate = " + userDate);

        if (userDate.isBefore(LocalDate.now())){
            System.out.println("Invalid date");
        } else {
            System.out.println("You can register");
        }

        // HW: Enter your birthday and get the exact day when you were born




    }
}
