package day04scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        // Ask the user to provide width, length and height of a rectangular prism.
        // Then calculate its total area.
        // HINT: formula for rectangular prism  =>    A=2(wl+hl+hw)
        // OR (2*w*l) + (2*h*l) + (2*w*h)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width, length and height of a rectangular prism");
        double width = scan.nextDouble();
        double length = scan.nextDouble();
        double height = scan.nextDouble();

        double totalArea = 2*((width*length) + (height*length) + (height*width));
        System.out.println("totalArea = " + totalArea);

        // Aks user to enter 5 digit integer value, calculate the addition of the first 2 and the last 2 digits
        // 65743  => 65  +  43  = 108

        System.out.println("Please enter 5 digit integer number");
        int number = scan.nextInt();

        int firstTwoDigits = number/1000;
        System.out.println("firstTwoDigits = " + firstTwoDigits); // 65

       int  lastTwoDigits = number%100;
        System.out.println("lastTwoDigits = " + lastTwoDigits);

        System.out.println("Addition of the first and last digits: " + (firstTwoDigits + lastTwoDigits));









    }
}
