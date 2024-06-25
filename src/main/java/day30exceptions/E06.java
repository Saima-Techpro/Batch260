package day30exceptions;

public class E06 {
    public static void main(String[] args) {

        String str = "Java is easy.";

        numOfChars(str); // 13

        String s = null;
        numOfChars(s); // NullPointerException
    }


    public static void numOfChars(String s){
        try{
            int a = s.length();
            System.out.println("length = " + a);
        } catch (NullPointerException npe){
            System.err.println("Can't calculate the length of a null variable.");
            npe.printStackTrace();
        }

    }
}
