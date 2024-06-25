package day30exceptions;

public class E04 {
    public static void main(String[] args) {

        String[] arr = {"J", "a", "v", "a"};

        getElementFromArray(arr , 2); // v
        getElementFromArray(arr , 7);  // ArrayIndexOutOfBoundsException


    }

    public static void getElementFromArray(String[] s, int inx){

        try {
            String element = s[inx];
            System.out.println("element = " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index can't be greater than the length of array which is "+(s.length-1));
        }

    }


}
