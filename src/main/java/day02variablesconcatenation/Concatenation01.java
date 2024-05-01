package day02variablesconcatenation;

public class Concatenation01 {
    public static void main(String[] args) {

        // Example: Create a greeting message in String container and print it on the console

       //  data type   nameOfTheVariable  Assignment operator    value    ;
            String       greetings              =      "Hello"     ;


            int a = 9;

            /*
            1. Primitive data types store values ONLY.
               Non-Primitive data types store values AS WELL AS methods.
            2. Primitive data types use memory based on their types
               Non-Primitive data types use memory in different ways depending upon their sizes
            3. Primitive data types use lowercase in their names.
               Non-Primitive data types use uppercase in their names.
            4. Primitive data types are created by JAVA.
               Non-Primitive data types can be created by us. (There's no limit to that)

             */

        System.out.println("greetings = " + greetings);
        // Update the greetings variable

        greetings = "Hello world!";
        System.out.println("greetings = " + greetings);

        greetings = "Hello TechPro Family.";

        System.out.println("greetings = " + greetings);

        System.out.println(); // ln => line  => prints the data on the console and cursor moves to the next line on the console
        System.out.print(greetings); // without ln => prints the data on the console and cursor remains at the same line

        String greetings1 = "Java is easy!";

        System.out.println("greetings1 = " + greetings1);

        // CONCATENATION => joining the data together using plus + sign

        System.out.println(greetings + greetings1);

        String classGreetings = greetings + greetings1;
        System.out.println("Class Greetings: " + classGreetings);


        // Plus '+' is used for concatenation in JAVA with String data type.
        // Concatenation means joining the data together.
        // Plus '+' is used for normal mathematical operations when used with numerical data types

        // What will happen if we try to join a String and an int data type?
        // CONCATENATION

        String str = "Apple";
        int x = 12 , y = 20;

        System.out.println(str + x + y);  // Apple1220  => Java sees String data type first, so it will perform concatenation
        System.out.println(str + (x + y));  // Apple32  => Java will do maths operation first because of parenthesis
        System.out.println(x + y + str);  // 32Apple => Java sees int data type first, so it will perform addition operation
        System.out.println(str + x * y); // Apple240  => Java will do maths operation first because multiplication has got first priority
        System.out.println(x + str + y); //  12Apple20

        char c = 'M';

        System.out.println(x + c + y); // 109  => because JAVA takes the ASCII value of char data type (ASCII value is number) so plus sign works as addition



    }
}
