package day31iterators_enum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {

        /*
        1- Iterators do the same job as loops
        2) There's no risk of an infinite loop with iterators (like with for-each)
        3) There is no performance difference between iterators and loops
        4) Iterators are more successful when it comes to removing elements from a collection or modifying an element within a collection
        5) There are two types of iterators:
            a) Iterator => This is only used for element removal; adding new elements or changing an element is not possible
            b) ListIterator => This can remove, add, and modify elements

            Note:
            The Iterator only works from left to right (from the first element to the last)
            ListIterator are Bi-directional => can work in both directions (goes Next and get back to Previous)

         */

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Fatma");
        myList.add("Veli");
        myList.add("Maryam");
        System.out.println(myList); // [Ali, Fatma, Veli, Maryam]

        // Update each element in this list by adding "!" => Ali!
//        for (String w: myList){
//            System.out.println(w+"!");
//        }

        System.out.println("======Iterators=======");
        // How to use Iterators?
        Iterator<String> myIter = myList.iterator();  // [Ali, Fatma, Veli, Maryam ]


        while (myIter.hasNext()){
            myIter.next();
            myIter.remove();
        }
        System.out.println("myList = " + myList); //[]

        /*
        hasNext() method checks if there is any element in the list or not; returns true if there is; returns false if there is no more element
        next()  method makes the pointer jump over the element and put it in front of next element. it also returns that element it jumped over.
        remove() just removes that element.
         */
    }
}
