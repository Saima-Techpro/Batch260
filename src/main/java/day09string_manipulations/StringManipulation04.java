package day09string_manipulations;

public class StringManipulation04 {
    public static void main(String[] args) {
        // Type code to find order number of last occurrence of the word "Java"

        String str = "I like to study Java. Learn Java, earn money. Java is OOP language. Java is easy!";

        int wordOccurrence = str.lastIndexOf("J");
        System.out.println("wordOccurrence = " + wordOccurrence);


        // Type code to check if the given letter in unique in the String

        String s = "Hello"; //H , e and o are unique, but l is repeated so it's not unique
                            // Miami => the only unique letter is a

        if (s.indexOf('H') == -1){
            System.out.println("The given letter doesn't exist");
        }  else if (s.indexOf('H') == s.lastIndexOf('H')){
            System.out.println( "The given letter is unique. ");
        } else {
            System.out.println("The given letter is not unique.");
        }


    }
}
