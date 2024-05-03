package day04scanner;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        /*

        Q.1: Type a code which calculates the area and the perimeter of a square
              whose side length is entered by user.
        Q.2: Type a code which calculates the cube of a number which is entered by user.
        Q.3: Type a code which calculates the area and the perimeter of a circle
            whose radius is entered by user. (Use float)
        Q.4: Type a code which converts the mile to kilometer. Mile value will be
            entered by user. (Use double)
        Q.5: Type a code which converts the hours to seconds. Hours value will be
            entered by user. (Use long)
        Q.6: Type a program which asks user to enter his/her full name, and address
             then print them on the console like the full name should be in the first line,
             and the address will be in the second line.

         */

        Scanner input = new Scanner(System.in);
//        Q.1:
//        Hint 1: Area of a square is length x length
//        Hint 2: Perimeter of a square is 4x length


        System.out.println("Enter length");
        Double l = input.nextDouble();

        System.out.println("Area of the perimeter is: "+ (l*l) + (4*l));

//      Q.2:
//      Hint 1: Cube of a number is a x a x a


        System.out.println("Enter a number to calculate its cube");
        short c = input.nextShort();
        System.out.println("The cube is: " + 3*c);

//       Q.3:
//        Hint 1: Take pi number as 3.14159
//        Hint 2: Area of a circle is 3.14159 x radius x radius
//        Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
//        Hint 4: To get float, use nextFloat()

        System.out.println("Enter radius of a circle");
        Float radious = input.nextFloat();
        System.out.println("Area of the circle is: " + 3.14159*(radious*radious));
        System.out.println("Perimeter of the circle is: " + 2*3.14159*radious);

//        Q.4:  Type a code which converts the mile to kilometer. Mile value will be
//        entered by user. (Use double)
//        Hint 1: km = mile x 1.6
//        Hint 2: To get double, use nextDouble()

        System.out.println("Enter miles");
        double miles = input.nextDouble();
        System.out.println((miles)*1.6 + " km");


//        Q.5: Type a code which converts the hours to seconds. Hours value will be entered by user. (Use long)
//             Hint 1: second = hour x 60 x 60
//             Hint 2: To get long, use nextLong()

        System.out.println("Hours");
        long h = input.nextLong();
        System.out.println((h)*60*60 + " seconds");

//        Q.6: Type a program which asks user to enter his/her full name, and address
//        then print them on the console like the full name should be in the first line,
//        and the address will be in the second line.

        input.nextLine(); // empty nextLine() method to take care of new line character '\n' coming from previous numeric methods

        System.out.println("Enter your full name please");
        String userName = input.nextLine();
        System.out.println("Enter your address please");
        String address = input.nextLine();

        System.out.println("Full name: " +userName);
        System.out.println("Address: " +address);

    }

}
