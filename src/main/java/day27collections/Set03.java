package day27collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set03 {
    public static void main(String[] args) {

        // Interview Question: Store the student emails in natural order
        // Logic: student emails should be unique

        long t1 = System.nanoTime(); // starting moment of TreeSet

        // 1st way: We try TreeSet because emails should be unique and in natural order
        TreeSet<String> stdEmails = new TreeSet<>();
        stdEmails.add("pq@gmail.com");
        stdEmails.add("lm@gmail.com");
        stdEmails.add("st@gmail.com");
        stdEmails.add("ab@gmail.com");
        stdEmails.add("xy@gmail.com");
        stdEmails.add("dg@gmail.com");
        System.out.println("stdEmails = " + stdEmails);  // [ab@gmail.com, dg@gmail.com, lm@gmail.com, pq@gmail.com, st@gmail.com, xy@gmail.com]


        long t2 = System.nanoTime(); // starting moment of HashSet
        // 2nd way: Use HashSet for speedy addition and then use TreeSet to sort them

        HashSet<String> emailsHS = new HashSet<>();
        emailsHS.add("pq@gmail.com");
        emailsHS.add("lm@gmail.com");
        emailsHS.add("st@gmail.com");
        emailsHS.add("ab@gmail.com");
        emailsHS.add("xy@gmail.com");
        emailsHS.add("dg@gmail.com");

        System.out.println("emailsHS = " + emailsHS); // [ab@gmail.com, pq@gmail.com, st@gmail.com, xy@gmail.com, lm@gmail.com, dg@gmail.com]

        long t3 = System.nanoTime(); // ending moment of HashSet

        // now create TreeSet and assign this emailsHS to TreeSet to sort it in alphabetical order
        TreeSet<String> sorted = new TreeSet<>(emailsHS);
        System.out.println("sorted = " + sorted);  // [ab@gmail.com, dg@gmail.com, lm@gmail.com, pq@gmail.com, st@gmail.com, xy@gmail.com]

        long t4 = System.nanoTime(); // ending moment of HashSet being sorted through TreeSet

        System.out.println("execution time for TreeSet: " + (t2 - t1));  // 1613375
        System.out.println("execution time for HashSet : " + (t3 - t2)); // 208167
        System.out.println("execution time for HashSet through TreeSet: " + (t4 - t3)); // 164542


    }
}