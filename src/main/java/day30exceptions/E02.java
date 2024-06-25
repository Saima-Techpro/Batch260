package day30exceptions;

public class E02 {
    public static void main(String[] args) {

        String s = "1234";
        convertStringToInt(s);

        String st = "2367abc";
        convertStringToInt(st);  // NumberFormatException is thrown when String has characters other than numbers.
                                    // Those character can't be changed into int data type.
    }


   public static void convertStringToInt(String s){

       try {
           int numbers = Integer.valueOf(s);
           System.out.println("numbers in int data type = " + numbers);
       } catch (NumberFormatException e) {
           System.out.println("Strings with mix of numbers and characters can't be converted to int");
           System.out.println(e.getMessage());
       }
   }


}
