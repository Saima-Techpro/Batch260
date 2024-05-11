package day09string_manipulations;

public class StringManipulation03 {
    public static void main(String[] args) {

        /*

        charAt() method returns single character on the given index => char data type
        substring() method returns string on the given index  => String data type
        indexOf() method returns index of the SINGLE character of a given String  => int data type

         */

        String str = "Java is an OOP language";

        int indexOfO = str.indexOf("OOP");
        System.out.println("index of O = " + indexOfO);

        // Example: Get the domain name from the given email and print it on the console
        // domain => gmail

        String email = "abc@gmail.com";

        // 1st way:
        String domainName = email.split("@")[1].split("\\.")[0];
        System.out.println("domainName = " + domainName);

        /*
        String domainName1 = email.split("a")[2];
        System.out.println("domainName1 = " + domainName1);

        NOTE: If the given sign/letter in the split() method occurs more than once in the String, split() method
        will split that string from all occurrences e.g. in this case 'a' occurs twice in the email, so split()
        will split the String from first 'a' and second 'a' and we will be left with three strings

         */

        // 2nd way: indexOf()

        //"abc@gmail.com"

        int startingIndex = email.indexOf("@")+1;
        System.out.println("startingIndex = " + startingIndex);  // 4

//        int endingIndex = email.indexOf("l");  // Hard coding
        int endingIndex = email.indexOf(".");
        System.out.println("endingIndex = " + endingIndex);

        String domainName2 = email.substring(startingIndex, endingIndex);
        System.out.println("domainName2 = " + domainName2);

        // 3rd way: MOST DYNAMIC WAY
        // What if we have multiple full stops e.g. ab.cd@gmail.com

        String email2 = "ab.cd@gmail.com";

        int startingIndex2 = email2.indexOf("@")+1;
        System.out.println("startingIndex2 = " + startingIndex2);  // 6

//        int endingIndex2 = email2.indexOf("."); // 2 => index of first occurrence of full stop
        int endingIndex2 = email2.lastIndexOf(".");
        System.out.println("endingIndex2 = " + endingIndex2); // 11

        String domainName3 = email2.substring(startingIndex2, endingIndex2);
       System.out.println("domainName3 = " + domainName3);

        // NOTE: indexOf() method returns the index of FIRST OCCURRENCE of the given character
        // NOTE: lastIndexOf() method returns the index of LAST OCCURRENCE of the given character


        // Example: Type code to find the number of words in the given String
        // split() + length
        // NOTE: When we use length method after split() method, we DO NOT use parenthesis ()

        String sentence = "I like to move it, move it";
        int numbOfWords = sentence.split(" ").length;
        System.out.println("numbOfWords = " + numbOfWords);


    }
}
