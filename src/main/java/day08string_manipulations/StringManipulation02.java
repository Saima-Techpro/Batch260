package day08string_manipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        /*
              ***********   NOTES ABOUT REGULAR EXPRESSIONS ***********

          To define a group of data, we use Regular Expressions in Java => short name REGEX...
          There are many REGEX, but we will learn most common ones:

           //inclusive Regex
                1) All the letters ==> [a-zA-Z]
                2) All lowercase letters ==> [a-z]
                3) All uppercase letters ==> [A-Z]
                4) All digits ==> [0-9]
                5) All the letters and digits ==> [a-zA-Z0-9]
                6) All punctuations ==> \\p{Punct}
                7) All the vowels ==> [aeiouAEIOU]
                8) All random characters like a, x, y  ==> [axy]
                9) A given range e.g. From A - G and a - g ==> [A-Ga-g]


            //exclusive Regex ==> we use "^" to exclude defined group of data....
            //It means "other than" or "except"

               1) All the characters other than digits ==> [^0-9]
               2) All the characters other than lowercase letters ==> [^a-z]
               3) All the characters other than letters ==> [^a-zA-Z]
               4) All the characters other than space ==> [^ ]

             // Following Regex are used without square bracket
               1) Only space character ==> \\s
               2) Except space character ==> \\S
               3) Only digits ==> \\d
               4) Except digits ==> \\D

         */

        String name = "   Tom Hanks   ";
        System.out.println("Original length= " + name.length());

        // Remove all spaces and count the number of alphabets in the given string
        // replaceAll() method removes any given regular expressions from the String

        String nameWithoutSpaces = name.replaceAll("\\s", "");  // only for spaces
        System.out.println("Without Spaces = " + nameWithoutSpaces);

        // Remove all alphabets and count the number of characters left in the given string
        String nameWithoutAlphabets = name.replaceAll("[a-zA-Z]", "");
        System.out.println("nameWithoutAlphabets = " + nameWithoutAlphabets);

        System.out.println("length of nameWithoutAlphabets:  " + nameWithoutAlphabets.length());


        String nameWithoutSpaces1 = name.replaceAll("[^a-zA-Z]", "");  // ^ means other than OR except
        System.out.println("nameWithoutSpaces1 = " + nameWithoutSpaces1);


        String str = "Learn Java &#% earn 10980 money";

        // Replace the word 'money' with 'dollars'
        String str1 = str.replace("money", "dollars");
        System.out.println("str1 = " + str1);

        // Remove letter 'a' from the string

        String strWithoutA = str.replace("a", "");
        System.out.println("strWithoutA = " + strWithoutA);

        // Remove the special characters from the String one by one

        String strWithoutSpecialChar = str.replace("%", "");
        System.out.println("strWithoutSpecialChar = " + strWithoutSpecialChar);

        // Remove the special characters from the String all at once

        String strWithoutAllSpecialChar = str.replaceAll("[&#%]", "");
        System.out.println("strWithoutAllSpecialChar = " + strWithoutAllSpecialChar);

        // Replace all numbers in the given string with *
        // "Learn Java &#% earn 10980 money"
        String strWithoutNumbers = str.replaceAll("[0-9]", "*");
        System.out.println("strWithoutNumbers = " + strWithoutNumbers);

        // Remove all numbers from the String and calculate total characters left
        // "Learn Java &#% earn 10980 money"
        int numOfChars =str.replaceAll("[0-9]", "").length();
        System.out.println("numOfChars = " + numOfChars);

        String s = "Regular expressions in Java !@#$ 1 2 5  %^>& are very special.";

       String updatedS =  s.replaceAll("[^a-zA-Z ]", "");
        System.out.println("updatedS = " + updatedS);

        // Remove all punctuation marks
        String sWithoutPunc = s.replaceAll("\\p{Punct}", "");
        System.out.println("sWithoutPunc = " + sWithoutPunc);


    }
}
