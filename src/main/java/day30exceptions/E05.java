package day30exceptions;

public class E05 {
    public static void main(String[] args) {
        /*
        Can we use more than one catch blocks?
        Yes, we can.
        We can use as many catch blocks as we want after try block. The order doesn't matter.
        EXCEPT when it comes to Exception class which is the parent class of all exceptions.
        We can NOT use Exception class first and other exceptions later. Java starts complaining.
        But we can use Exception class after any/all other exceptions.
         */

        int a = 15;
        int b = 0;
        String s = "Java";
        getChar(s, a, b);
        getCharFromString(s, a, b);

    }

    public static void getChar(String s, int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Don't use index greater than the length of the String");
        }catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
            System.out.println(e.getCause());
        }

    }

    public static void getCharFromString(String s, int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        }catch (Exception e){
            System.out.println("Can't divide by zero");
            System.out.println("Don't use index greater than the length of the String");
            System.out.println("This is the Parent taking care of all types of Exceptions... ");
        }

    }
}
