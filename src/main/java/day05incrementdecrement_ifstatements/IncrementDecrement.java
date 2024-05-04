package day05incrementdecrement_ifstatements;

public class IncrementDecrement {
    public static void main(String[] args) {

        // Increment
        int s = 6;
        System.out.println("Original: " + s);

        // Increase the value of s variable by 2
         s = s+2;
        System.out.println("Increased value:" + s);

        // Another way of doing the increment
        s += 2;  // s = s+2; is doing the exact same function as s += 2;
        System.out.println("Value after second increment: " + s);


        // Decrement

        int d = 13;
        System.out.println("Original: " + d);

        // Decrease the value of d variable by 2
        d = d - 2;
        System.out.println("Decreased value: "+  d);

        // Another way of doing the decrement
        d -= 2;
        System.out.println("Decreased value after second decrement: "+  d);

        // NOTE: d = d-2; syntax performs the same function as d -= 2;

        // Increment by multiplication

        int a = 14;
        System.out.println("Original: "+ a);
        a = a*5;
        System.out.println("After first increment: "+ a);
        a *= 5;
        System.out.println("After second increment: "+ a);

        // Decrement by division
        a = a/7;
        System.out.println("After first decrement: "+ a);
        a /= 5;
        System.out.println("After second decrement: "+ a);

        // Increase by 1

        int m = 12;
        System.out.println("Original: " + m);
        m = m+3;  // we can use any value for increment in this syntax
        System.out.println("After first increment: "+ m);
        m += 5;  // we can use any value for increment in this syntax
        System.out.println("After second increment: "+ m);
        m++;     // shorted syntax  => But this syntax is used for increasing the value ONLY by 1 at a time
        System.out.println("After using shortest syntax m++ for increment: "+ m);


        // Decrease by 1

        int x = 50;
        System.out.println("Original: " + x);
        x = x-3;  // we can use any value for decrement in this syntax
        System.out.println("After first decrement: "+ x);
        x -= 5;  // we can use any value for decrement in this syntax
        System.out.println("After second decrement: "+ x);
        x--;     // shorted syntax  => But this syntax is used for decreasing the value ONLY by 1 at a time
        System.out.println("After using shortest syntax x-- for decrement: "+ x);
        x--;
        x--;
        x--;
        x--;
        System.out.println("After using shortest syntax x-- for decrement: "+ x);


        // Now we will learn how to do increment/ decrement and assign to a ANOTHER container (variable)


        int k = 16;
        System.out.println("Original k: " + k);
        int y = k++;   // do assignment first , increment later  (Post assignment increment)

        System.out.println("y: " + y);
        System.out.println("after increment of k: " + k);

        int b = 18;
        System.out.println("Original b: " +  b);
        int c = ++b;  //  do increment first, assign later (Pre assignment increment)

        System.out.println("After increment by ++b: " + b);
        System.out.println("After increment by ++b: " + c);

        // post decrement

        int p = 20;
        System.out.println("original p: " +  p);
        int q = p--;  // do assignment first , decrease later  (Post assignment decrement)
        System.out.println("q: " +  q);
        System.out.println("p: " +  p);

        // pre decrement

        int l = 32;
        System.out.println("original l:" +  l);
        int n = --l;  //  do decrement first, assign later (Pre assignment decrement)
        System.out.println("n: " + n);
        System.out.println("after decrement l: " + l);





    }
}
