package day06ifstatement_switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // Create a simplified version of a calculator.
        // Ask user to provide two numbers and perform the mathematical operation chosen by the user.
        // + , -, *  , / , %

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNUm = scan.nextDouble();

        System.out.println("Enter second number");
        double secondNUm = scan.nextDouble();

        System.out.println("Which operation you want to perform? Choose + , - , * , / ");
        char operation = scan.next().charAt(0);  // charAt(0) returns single character from the given index and indexes start from 0


        switch (operation){
            case '+':
                System.out.println("Addition: "+ (firstNUm + secondNUm));
                break;
            case '-':
                System.out.println("Subtraction: "+ (firstNUm - secondNUm));
                break;
            case '*':
                System.out.println("Multiplication: " +(firstNUm*secondNUm));
                break;
            case '/':
                System.out.println("Division: " +(firstNUm/secondNUm));
                break;
            case '%':
                System.out.println("Percentage: " +(firstNUm%secondNUm));
                break;
            default:
                System.out.println("This calculator doesn't support given symbol");
        }


    }
}
