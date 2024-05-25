package day17mdarrays_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        // Create an Integer ArrayList

        List<Integer> myArray = new ArrayList<>();
        System.out.println("myArray = " + myArray); // []

        myArray.add(22);
        myArray.add(5);
        myArray.add(42);
        myArray.add(9);
        myArray.add(14);
        System.out.println("myArray = " + myArray); // [22, 5, 42, 9, 14]

        // Calculate the number of elements in this list
        int numOfElements = myArray.size();
        System.out.println("numOfElements = " + numOfElements); // 5

        // Get 42 out of the ArrayList and print on the console
        int a = myArray.get(2);
        System.out.println("a = " + a);  // 42

       // Replace 9 with 25
       myArray.set(3, 25);
        System.out.println("myArray updated = " + myArray);  // [22, 5, 42, 25, 14]

        // Replace all odd elements with 10 in the given ArrayList
        // Using for loop

//        for (int i = 0; i < myArray.size()-1; i++) {
//            if ( myArray.get(i)%2!=0){
//                myArray.set(i,10);
//            }
//        }
//        System.out.println("myArray = " + myArray); // [22, 10, 42, 10, 14]


        // Using for each loop
        // [22, 5, 42, 25, 14]

        for (Integer w: myArray){
            if ( w%2 != 0){
                myArray.set(myArray.indexOf(w), 10); // [22, 10, 42, 10, 14]
            }
        }
        System.out.println("myArray = " + myArray);

    }
}
