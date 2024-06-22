package day28collections;

import java.util.*;

public class Queue02 {
    public static void main(String[] args) {

        /*
        PriorityQueue is a queue tool that sorts objects according to their priority order in a FIFO (first in first out)
        structure.
        That is, the object with the highest priority is always handled first.

        -	A real-life example could be the order of patients entering the emergency room at a hospital
            represented as a priorityQueue.
            Patients are sorted according to their urgency levels.
            The patient with the highest urgency is always treated first.

         */

        // Queue<String> emergencyQueue = new PriorityQueue<>();
        PriorityQueue<String> emergencyQueue = new PriorityQueue<>();
        emergencyQueue.add("Saima");
        emergencyQueue.add("Tom");
        emergencyQueue.add("John");
        emergencyQueue.add("Ali");
        emergencyQueue.add("Mert");
        emergencyQueue.add("Arda Guller");


        // add() method for PriorityQueue adds elements randomly.

        System.out.println(emergencyQueue);  // [Ali, John, Arda Guller, Tom, Mert, Saima]

        // remove() returns and removes the first element from the queue and puts the remaining elements in random order
        System.out.println(emergencyQueue.remove());  // Ali
        System.out.println(emergencyQueue); // [Arda Guller, John, Saima, Tom, Mert]

        /*
        Deque (Double-Ended Queue) is a data structure that allows adding and removing elements from both ends.
        Deque can be sorted as FIFO (first in first out) or LIFO (last in first out).

        Real Life example: Browser history and ability to move back and forth between the browsers

         */

        Deque<String> stdNames = new LinkedList<>();
        stdNames.add("Saima");
        stdNames.add("Tom");
        stdNames.add("John");
        stdNames.add("Ali");
        stdNames.add("Mert");
        stdNames.add("Arda Guller");


        // add() method for Deque follows the insertion order
        System.out.println("stdNames = " + stdNames); // [Saima, Tom, John, Ali, Mert, Arda Guller]

        // Deque allows addFirst and addLast methods because it's a double-ended queue
        stdNames.addFirst("Junaid");
        stdNames.addFirst("Junaid");
        System.out.println("stdNames = " + stdNames);

        stdNames.addLast("Husnu");
        stdNames.addLast("Husnu");
        System.out.println("stdNames = " + stdNames); // [Junaid, Junaid, Saima, Tom, John, Ali, Mert, Arda Guller, Husnu, Husnu]

        // remove() method returns and removes the first element at the head of the queue
        System.out.println(stdNames.remove());
        System.out.println("stdNames = " + stdNames); // [Junaid, Saima, Tom, John, Ali, Mert, Arda Guller, Husnu, Husnu]

        System.out.println(stdNames.removeFirst()); // Junaid
        System.out.println("stdNames = " + stdNames); // [Saima, Tom, John, Ali, Mert, Arda Guller, Husnu, Husnu]

        System.out.println(stdNames.removeLast()); // Husnu
        System.out.println("stdNames = " + stdNames); // [Saima, Tom, John, Ali, Mert, Arda Guller, Husnu]

        stdNames.add("Ali");  // [Saima, Tom, John, Ali, Mert, Arda Guller, Husnu, Ali]
        System.out.println("stdNames = " + stdNames);

        System.out.println(stdNames.removeFirstOccurrence("Ali")); // true
        System.out.println("stdNames = " + stdNames);  // [Saima, Tom, John, Mert, Arda Guller, Husnu, Ali]

        stdNames.removeFirstOccurrence("Ali");
        System.out.println("stdNames = " + stdNames);  // [Saima, Tom, John, Mert, Arda Guller, Husnu]

        // How to get elements out of the queue one by one?
        for (String w:stdNames){
            System.out.println(w);
        }

        // push() method acts like add() and adds the element to head of the queue
        stdNames.push("Uranus");
        System.out.println("stdNames = " + stdNames); // [Uranus, Saima, Tom, John, Mert, Arda Guller, Husnu]

        // pop() method removes the element from the head of the queue
        System.out.println(stdNames.pop());
        System.out.println("stdNames = " + stdNames); // [Saima, Tom, John, Mert, Arda Guller, Husnu]

        System.out.println("===========================");

        /*
        ArrayDeque (implementing deque interface)
            -	This structure allows for fast addition and removal of elements at both the beginning and the end.
            -	ArrayDeque offers higher performance compared to LinkedList because it uses an array-based structure
                for its contents.
            -	ArrayDeque is ideal for fast addition/removal operations at both ends.
            -	ArrayDeque has a dynamic structure

         */

        Deque<String> furnitureTruck = new ArrayDeque<>();
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Coffee Table");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dinning Table");
        System.out.println("furnitureTruck = " + furnitureTruck); // [Sofa, Coffee Table, Bed, Dinning Table]

        furnitureTruck.addFirst("TV Unit");
        System.out.println("furnitureTruck = " + furnitureTruck); // [TV Unit, Sofa, Coffee Table, Bed, Dinning Table]

        furnitureTruck.addLast("Chair");
        System.out.println("furnitureTruck = " + furnitureTruck);  // [TV Unit, Sofa, Coffee Table, Bed, Dinning Table, Chair]


    }
}
