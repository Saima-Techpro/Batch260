package day01variables;

public class Variables01 {  // opening class body

    public static void main(String[] args) {

        // Data type     nameOfVariable  Assignment Operator   value   ;
             int           age              =                    25    ;

        // Example 1: Create a variable whose value is 12.99
        double priceOfShirt = 12.99;
        float num = 12.99F;

        //       DATA TYPES

        /*
        1) integer: It is used for whole numbers.
        The minimum value for integers is -2,147,483,648
        The maximum value for integers is 2,147,483,647
        integer variables use 32 bits of memory   (8 bits = 1 byte)

        2) short: It is used for whole numbers.
        The minimum value for short is -32,768
        The maximum value for short is 32,767
        short variables use 16 bits of memory

        3) byte: It is used for whole numbers.
        The minimum value for byte is -128
        The maximum value for byte is 127
        byte variables use 8 bits of memory

        Q: What data type will you prefer if you need to store the age of university students?
        byte

        4) long: It is used for whole numbers.
        The minimum value for long -9,223,372,036,854,755,808
        The maximum value for long 9,223,372,036,854,755,807
        long variables use 64 bits of memory


         */

        int populationOfUK = 67000000;
        System.out.println(populationOfUK);

        // NOTE: Java accepts long value as integers by default.
        // But if your value is greater than the integer max range, you'll get an error.
        // To fix that error, you have to insist by adding "L" or "l" at the end of your value.
        long populationOfTheWorld = 7000000000L;

        long populationOfTurkiye = 850000000;

        byte ageOfStudents = 27;
        short populationOfTown = 32000;
        System.out.println(ageOfStudents); // 27
        System.out.println("-----------------------");
        System.out.println(populationOfTown); // 32000

        /*
             Data types about decimals

             1) float: It is used for decimal values
                       float variables use 32 bits of memory
                 NOTE: When you create float variable, you need to add "F" or "f" at the of the value

             2) double: It is used for decimal values
                       double variables use 64 bits of memory

             Data types related with numbers
             byte < short < int < long < float < double

         */

        float priceOfLaptop = 870.99F;
        double priceOfDesktop = 999.80;

        /*
          1) boolean: It is used for "true" or "false" answers
                      boolean uses only 1 bit of memory

          2) char: It is used for "single" character (symbols, punctuations, numbers, letters etc.)
                      char uses 16 bits of memory
                      Use single quotation marks
         */

        boolean isRetired = true;
        boolean isOld = false;
        System.out.println("--------------------");
        char initialOfName = 't';
        System.out.println(initialOfName);

        //  byte , short , int , long , float , double, boolean, char  =>  PRIMITIVE DATA TYPES
        // Primitive data types have 'values' ONLY.

        /*
                 NON-PRIMITIVE DATA TYPES
           String: It is a non- primitive data type.
                   It is used to store sequence of characters (e.g. text)
                   The default value of String is null

           What is the difference between PRIMITIVE and NON-PRIMITIVE DATA TYPES?
           1)  Primitive data types have 'values' ONLY. Non-Primitive data types have values AS WELL AS methods.
           2) Primitive data types are created by Java. We cannot create them. Non-Primitive data types can be created by us.
           3) Primitive data types use lowercase in their names whereas Non-Primitive data types use UPPERCASE in their names
           4) Memory usage in Primitive data types changes from data type to data type. But Non-Primitive data types use same amount
              of memory (we learn details about it later)


          There are two types of memory in Java
          1) Stack  memory: Stores a) Primitive data   b) references of Non-Primitive data
             NOTE: In Java, a fixed memory space of 4 or 8 bytes (32 or 64 bits) is typically allocated on the stack for references to non-primitive types.
          2) Heap memory: stores Non-Primitive data

         */

         String name = "Tom Hanks";
        System.out.println(name);









        // Example 2: Create an integer variable and 2 double variables and then print their sum
        int shirt = 21;
        double shoes = 12.55 , socks = 6.99;

        System.out.println(shirt + shoes + socks);  // 40.54

        // NOTE: If you use different data types in math operation, the largest data type will be returned for the result

        // Example 3: Create 2 float variables, 3 short variables and 2 double variables and then print their sum

        float num1 = 15.45F , num2 = 34.37f;
        short num3 = 4,  num4 = 5, num5 = 9;
        double num6 = 65.4 , num7 = 0.56;

        System.out.println(); // it's used to print the result on the console. It doesn't store the data in database

        System.out.println(num1 + num2 + num3 + num4 + num5 + num6 + num7);  // 133.77999969482423

        double sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;

        System.out.println(sum);





    }


} // closing class body

