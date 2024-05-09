package javapractice;

import java.util.Scanner;

public class Q06_SplitNumber {
    public static void main(String[] args) {

        /*
         Type a code to break/split an integer into a sequence of individual digits.
Hint: use / and %
x: input: 12345
output:        1
               2
               3
               4
               5
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 digits number!");

        int x = scan.nextInt();

        int ones = x%10;  // 12345 % 10 => remainder is 5

        int tens = (x/10)%10; // 12345 / 10 => 1234.5 => decimal part will be removed because of int data type
                              // 1234 % 10 => remainder is 4

        int hundreds = (x/100)%10;     // 12345 / 100 => 123.45 => decimal part will be removed because of int data type
                                    // 123 % 10 => remainder is 3

        int thousands = (x/1000)%10;  // 12345 / 1000 => 12.345
                                        // 12 % 10 => remainder is 2


        int tenThousand = (x/10000)%10;  // 12345 / 10000 => 1.2345
                                        // 1 % 10 => remainder is 1

        System.out.println(tenThousand +"\n" + thousands +"\n"+ hundreds +"\n" + tens +"\n"+ ones);


    }
}
