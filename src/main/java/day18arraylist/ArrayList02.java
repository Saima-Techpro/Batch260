package day18arraylist;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        // Type code to check if the ArrayList doesn't have any element other than space
        // or it doesn't have any element at all
        // [] is acceptable ; [ , , ] is acceptable but [a] is not acceptable

//        ArrayList<String> list = new ArrayList<>();

        List<String> list1 = new ArrayList<>();  // ArrayList has more flexibility when created by List INTERFACE

        list1.add(" ");
        list1.add(" ");
        list1.add(" ");

        // list1.add("a");


        System.out.println("list1 = " + list1); // [ ,  ,  ,  , a]

        // removeAll() method is used to remove multiple elements after checking if they're same or not

        List<String> list2 = new ArrayList<>();
        list2.add(" ");

        System.out.println("list2 = " + list2);  // [ ]

        list1.removeAll(list2);

        System.out.println("list1 after removing spaces = " + list1);

        if (list1.isEmpty()){
            System.out.println("The List is empty");
        } else {
            System.out.println("The List has some characters other than spaces");
        }

        //2nd way:
        boolean isTrue = list1.remove(" ");
        System.out.println("isTrue = " + isTrue);  // false  => true if this list contained the specified element (space in this example)
        System.out.println("list1 = " + list1);

        System.out.println("======= INTERVIEW QUESTION =========");

        // INTERVIEW QUESTION
        // Create an integer ArrayList and find the closest elements
        //  [12, 23, 5, 9, 21] =>  21, 23

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(23);
        myList.add(5);
        myList.add(9);
        myList.add(21);

        System.out.println("myList = " + myList);  // [12, 23, 5, 9, 21]

//        myList.sort();  => shows error
        // 1st way:
        // myList.sort(null);

        // 2nd way:
        Collections.sort(myList);  // original list => [12, 23, 5, 9, 21]
        System.out.println("sorted List = " + myList);  // sorted list => [5, 9, 12, 21, 23]

        int minDiff = myList.get(1) - myList.get(0);  // sample value  OR assumed minimum value


        // Math.min();  // It compares the two values and returns the minimum out of the two


        for (int i = 1; i < myList.size() ; i++) {
           minDiff =  Math.min(minDiff , myList.get(i) - myList.get(i-1));
        }
        System.out.println("minDiff = " + minDiff);  // 2

        // Now we found the minimum difference between the elements that we have in our ArrayList
        // sorted list => [5, 9, 12, 21, 23]

        for (int i = 1; i< myList.size();  i++){
            if (myList.get(i) - myList.get(i-1)    ==    minDiff){

                System.out.println(myList.get(i) + " , " + myList.get(i - 1));
            }

        }


    }
}
