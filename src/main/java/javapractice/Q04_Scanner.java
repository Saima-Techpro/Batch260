package javapractice;

import java.util.Scanner;

public class Q04_Scanner {
    public static void main(String[] args) {

        // Type a code to calculate the hypotenuse of a right angle triangle.
        // Take the values from the user
        // Hint: We need to use Math class to calculate square root => Math.sqrt()

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of length a");
        double a = scanner.nextDouble();

        System.out.println("Enter value of length b");
        double b = scanner.nextDouble();

        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("hypotenuse = " + c);
        System.out.println("hypotenuse after rounding up = " + Math.round(c));

    }
}
