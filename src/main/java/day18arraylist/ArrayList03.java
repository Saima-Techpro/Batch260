package day18arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        // 1st way of creating ArrayList
//        ArrayList<Integer> myList = new ArrayList<Integer>();
        // 2nd way of creating ArrayList
//        ArrayList<Integer> myList = new ArrayList<>();

        // 3rd way of creating ArrayList
        List<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(5);
        myList.add(4);
        myList.add(10);
        myList.add(2);
        System.out.println(myList); // [7, 5, 4, 10, 2]

        myList.remove(0);
        System.out.println("myList after remove= " + myList);  // [5, 4, 10, 2]

        System.out.println(myList.get(1));  // 4

         myList.set(2, 15);
        System.out.println("myList = " + myList);  // [5, 4, 15, 2]

        // 4th way of creating ArrayList

        // Create another List using asList() from Arrays class

        List<Integer> secondList = Arrays.asList(11, 12, 13, 14);
        System.out.println("secondList = " + secondList);  // [11, 12, 13, 14]


//        secondList.remove(0);  // error => java.lang.UnsupportedOperationException
//        System.out.println("secondList = " + secondList);


//        secondList.add(15);  // error => java.lang.UnsupportedOperationException
//        System.out.println("secondList = " + secondList);

        secondList.set(1, 15);
        System.out.println("secondList after set() = " + secondList); // [11, 15, 13, 14]

        /*
        Notes about Arrays.asList() method
        1) We can use this method to create List. But this doesn't behave the same way as ArrayLists.
           Because asList() method is coming from Arrays class which works as Arrays at the background.
        2) Arrays are fixed size structures that's why we can't use add() and remove() methods with the lists
           that are created by using asList() method.
        3) However, we can still use other methods like set() or size() methods which are available for Lists

        4) We can use this way of creating Lists when we have fix size of elements. We don;t need to add/remove
           elements. But we can use other methods that are available for lists.

         */


    }
}
