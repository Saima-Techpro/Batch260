package javapractice;

public class Q05_SwapNumbers {
    public static void main(String[] args) {
        // Interview question:
        // Type code to swap two integers

        int a = 7;
        int b = 4;
        System.out.println("Before swap: " + a + ", " + b);

        int temp = 0; // temporary container
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: " + a + ", " + b);

        // swap without creating temporary container

        int x = 6;
        int y = 9;

        System.out.println("Before swap: " + x + ", " + y);
        x = x+y; // 6+9= 15
        y = x-y;  // 15-9= 6
        x = x-y;  // 15-6=9
        System.out.println("After swap: " + x + ", " + y);



    }
}
