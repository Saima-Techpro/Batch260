package day26collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList();  // concrete class constructor to reach out ArrayList concrete class
        // List<String> list2 = new List();  // error=> because interfaces don't have constructors

        List<String> list2 = new ArrayList<>(); // concrete class constructor to reach out List interface

        Object list3 = new ArrayList<>();   // This also works

        /*
        Arrays[] are fixed length / structure. They can't dynamically grow small / big.
        Multidimensional Arrays are also complex structures. Not suitable for dynamic elements; lack flexibility.

        We use Lists (ArrayList or LinkedList to store multiple values, so we can change size (add/remove elements) dynamically.

         */

        List<String> myList = new LinkedList<>();

        // 1. add() method
        myList.add("Hulya");
        myList.add("Husnu");
        myList.add("Juniad");
        myList.add("Henok");

        System.out.println("myList = " + myList);  // myList = [Hulya, Husnu, Juniad, Henok]

        // Linked List structural design => [Head]-> Hulya-> Husnu-> Junaid-> Henok-> null [Tail]
        //                                       node has 2 parts:  1. data 2. pointer where pointer acts like an index
        // NOTE: LinkedList don't have indexes. Pointers act like an index.

        // 2. add(ind, string) method
        myList.add(2, "Uranus");  // adds the value at the specified place
        System.out.println("myList = " + myList);  // [Hulya, Husnu, Uranus, Juniad, Henok]


        // 3. addFirst() method
        myList.addFirst("Nataliya");
        System.out.println("myList = " + myList);  // [Nataliya, Hulya, Husnu, Uranus, Juniad, Henok]


        // 4. addLast() method
        myList.addLast("Anisa");
        System.out.println("myList = " + myList);



    }
}
