package day30exceptions;

public class E03 {
    public static void main(String[] args) {

        String s = "Java is easy.";

        getChar(s, 3);  // a
        getChar(s, 15);  // StringIndexOutOfBoundsException is thrown when a non-existing index is asked for
    }

    public static void getChar(String s, int idx){

        try {
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        } catch (Exception e) {
            System.out.println("Use index according to the String length");
            System.err.println("Don't use index out of bound!"); // This will be printed in red as error message
            e.printStackTrace(); // when developers want to see the details about exceptions
            System.out.println("Helloooo again :)");

        }


    }
}
