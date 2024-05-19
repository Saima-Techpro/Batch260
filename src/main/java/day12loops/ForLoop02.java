package day12loops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {

        // Example: Calculate the total value of decimal part of the given number
        // 459.789 => 789 => 7+8+9 => 24

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal value");
        double number = scan.nextDouble();

        String strNum = String.valueOf(number);  // This will make the data type of number to String, so we can manipulate it easily
        System.out.println("strNum = " + strNum); // 789 => This is String data type of the given number

        String decimalPart = strNum.split("\\.")[1];
        System.out.println("decimalPart = " + decimalPart);  // 789

        // Now we need to separate each digit from the given number
        // use % and division operation

        // NOTE: we can't do any mathematical operation on String data type. So we have to convert it back to Int

        int intDigit = Integer.valueOf(decimalPart);
        System.out.println("intDigit = " + intDigit); // 789  => but this is converted back into int data type

        int sum = 0;
        for (int i = intDigit; i>0; i /=10 ){
            sum = sum + i%10;
            //System.out.println(sum );
        }
        System.out.println("sum = " + sum);

    }
}
