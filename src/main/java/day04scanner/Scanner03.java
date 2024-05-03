package day04scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

      /*
      Get two numeric values from the user, store them in double data type.
      Calculate their multiplication and division and print them on the console
       */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the two numeric values");
        double num1 = scan.nextDouble();
        System.out.println("num1 = " + num1);

        double num2 = scan.nextDouble();
        System.out.println("num2 = " + num2);

        System.out.println( "Multiplication: " +num1*num2);
        System.out.println( "Division: " +num1/num2); // double data type is very sensitive and it returns you large value after the decimal


        System.out.println( "Division: " + String.format("%.3f" ,   (num1/num2)   ));
        System.out.println( "Division: " + String.format("%.2f" ,   (num1/num2)   ));

        // Get the width and the length of a rectangle from the user and calculate its area. (Use float / double data)

        System.out.println("Enter the length of a rectangle");
        float length = scan.nextFloat();

        System.out.println("Enter the width of a rectangle");
        float width = scan.nextFloat();

//        System.out.println("Area: " + length*width);

        float area = length*width;
        System.out.println("area = " + area);

        // Also calculate the perimeter of this rectangle => 2*(length+width)

        System.out.println("Perimeter: " + (2*(length+width)));


    }
}
