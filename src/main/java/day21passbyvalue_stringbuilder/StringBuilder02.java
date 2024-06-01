package day21passbyvalue_stringbuilder;

public class StringBuilder02 {
    public static void main(String[] args) {
        /*

        length() method provides character count whereas capacity() method indicates the size of places
        being allocated but unused.

           ==> Initially, Java gives you a capacity of 16.
                If you exceed this given capacity, Java adjusts the new capacity : default*2+2
                After that limit: optimization starts ?????????

                Optimization means it will stop following this rule => default*2+2 of increasing the allocation
                of more spaces after some point, and it will start allocating ONLY that many places that are added.

         Can we change the default capacity and assign capacity according to our needs?
         Yes we can. We mention the int data while creating StringBuilder.
         That will be considered CUSTOM CAPACITY.
         */
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.length()); // 0
        System.out.println(sb.capacity()); // 16

        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.length()); // 4
        System.out.println(sb.capacity()); // 16

        sb.append(" is easy.");
        System.out.println(sb);
        System.out.println(sb.length()); // 13
        System.out.println(sb.capacity()); // 16

        sb.append("It is OOP.");
        System.out.println(sb);
        System.out.println(sb.length()); // 23
        System.out.println(sb.capacity()); // 34


        sb.append("This OOP is driving us crazy!!");

        System.out.println(sb);
        System.out.println(sb.length()); // 53
        System.out.println(sb.capacity()); // 70

        sb.append("********************************************************************************************");
        System.out.println(sb);
        System.out.println(sb.length()); // 145
        System.out.println(sb.capacity()); // 145


        System.out.println("======= CUSTOM CAPACITY =========");

        // StringBuilder sb1 = new StringBuilder(); // default capacity => 16
        StringBuilder sb1 = new StringBuilder(5); // custom capacity => 5

        System.out.println(sb1);
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 5

        sb1.append("Hulya");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 5
        System.out.println(sb1.capacity()); // 5

        sb1.append(" is");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 8
        System.out.println(sb1.capacity()); // custom*2+2 => new customised capacity => 12


        sb1.append(" a developer.");
        System.out.println(sb1);
        System.out.println(sb1.length()); // 21
        System.out.println(sb1.capacity()); // custom*2+2 => new customised capacity => 26


        // Until it reaches optimisation






    }
}
