package day34lambda;

public class Utils {

    /*
    In Java, the fundamental concept behind creating a "Utils" (utility) class is to gather helper methods related to
    a certain concept or functionality together. These classes usually consist of static methods and are called directly
    via the class name. We add methods for functionality that is not built into Java but is frequently used in our
    projects, and we invoke these methods as needed. We can create new methods that are fit for the purpose.

     */
    public static void printWithSpace(Object obj){
        System.out.print( obj + " ");
    }


    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }

    public static boolean isNumEven(int num){
        return num % 2 == 0;
    }
}
