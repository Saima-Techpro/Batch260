package day08string_manipulations;

public class StringManipulation01 {
    public static void main(String[] args) {
        /*
        String is a Non-Primitive data type.
        It has values as well as methods.
        String value is always declared using double quotes ""
        Strings can store text, letters, numbers, signs, any characters
        */

        String str = "Java is easy!";

        System.out.println("Lower case: " + str.toLowerCase());

        System.out.println("Upper Case: " + str.toUpperCase());

        String str1 = "I love Java.";

        System.out.println("*****  String Concatenation *****");
        /*
        String Concatenation is the process og joining two strings together.
        There are two ways to join Strings as following:
        In 1st way, you can do add any symbol like comma, full stop etc. between the two Strings.
        but you can't do that with concat() method

        NOTE: It's always recommended to use methods which are provided by Java.

         */

        // 1st way: Concatenation by using + operator between two Strings
        System.out.println( "Concatenation: " + str + " " + str1);

        // 2nd way:
        System.out.println("Concatenation using concat() method: " + str.concat(str1));

        // Check the length of the string and calculate total number of characters
        // length() method counts the number of characters (letters, numbers, special characters etc.) in a String INCLUDING spaces
        // "Java is easy!"

         int numOfChars = str.length();  // 13
        System.out.println("numOfChars = " + numOfChars);

        // "Java is easy!"
        // Get the first and last character from the above String
        // charAt() method works with the index of the given String
        // Index is the place allocated to each character in the String
        // Indexes always start from zero

        char firstChar = str.charAt(0);
        System.out.println("firstChar = " + firstChar);

        char lastChar = str.charAt(12);  // Hard coding => if your code doesn't work for all / different values, it's called Hard Coding
        System.out.println("lastChar = " + lastChar);

       // Dynamic  => if your codes works for all / different values, it's called Dynamic

        char lastChar1 = str.charAt(str.length()-1);
        System.out.println("lastChar1 = " + lastChar1);

        // equals() is used to check equality of the two Strings
        // It always looks for EXACT match
        // equals() method returns boolean
        // equalsIgnoreCase() method converts all values to lowercase and then check for equality

//        String str = "Java is easy!";
        String str2 = "java is easy!";

        System.out.println("Is equal? " + str.equals(str2));

        System.out.println("IgnoreCase = " + str.equalsIgnoreCase(str2));


        // trim() method = > removes the spaces before and after the actual value
        // Does trim() method remove the spaces between the words?
        // It doesn't remove spaces between the words
        String name = "  Tom Hanks   "; // This String has some empty spaces before and after the actual value
        System.out.println("Total no of chars before trimming:  " + name.length());
        System.out.println("Before trimming: " + name.charAt(name.length() - 1));

        name = name.trim(); // trim() method removes the spaces before and after the actual value

        System.out.println("Total no of chars after trimming:  " + name.length());
        System.out.println("After trimming: " + name.charAt(name.length() - 1));




    }
}
