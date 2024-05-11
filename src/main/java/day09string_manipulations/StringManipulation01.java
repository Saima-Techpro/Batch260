package day09string_manipulations;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*               substring() method
        There are two types of substring methods:
        substring(starting index);  => single parameter
        substring(starting index, ending index);  => two parameters

        starting index => inclusive => means the value at this index is included
        ending index => exclusive => means the value at this index is NOT included
        indexes start from zero


         */

        String str = "Learn Java, earn money. Enjoy your life!";

        // Print the word "Learn" form the given String.

        String firstWord = str.substring(0, 5);
        System.out.println("firstWord = " + firstWord);

        // Print the word "Java" from the given string

        String secondWord = str.substring(6,10);
        System.out.println("secondWord = " + secondWord);

        // Print the whole string after the word Learn
        String remainingWords = str.substring(6, 22);
        System.out.println("remainingWords = " + remainingWords);

        // 2nd way: use the substring method with single parameter
        String remainingWords2 =  str.substring(6);
        System.out.println("remainingWords2 = " + remainingWords2);

        // Check if the remaining String has the word "Enjoy"
        // contains() method returns boolean and it is case-sensitive.

        boolean isExist = remainingWords2.contains("Enjoy");
        System.out.println("isExist = " + isExist);

        // There are two startsWith() methods
        // startsWith("")  => single parameter => the starting word/letter that you want to check
        // startsWith("" , int)  => two parameters => first being the string that you want to check;
        //                                            second being the indexes that you want to offset (skip)

        // Check if the given string starts with the word "Java"
        boolean isStart = str.startsWith("Learn");
        System.out.println("isStart = " + isStart);

        //"Learn Java, earn money. Enjoy your life!"

        System.out.println(str.startsWith("money", 17)); // true => after offsetting 17 indexes, the remaining String starts with "money" =>  "money. Enjoy your life!

        System.out.println(str.startsWith("Enjoy", 24)); // true =>  after offsetting 24 indexes, the remaining String starts with "Enjoy" =>  "Enjoy your life!

        // endsWith method
        boolean isEnd = str.endsWith("!");
        System.out.println("isEnd = " + isEnd);




    }
}
