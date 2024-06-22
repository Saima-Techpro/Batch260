package day28collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        /*

        In Java, a Queue is a data structure where data is stored and processed in a specific order.
       It follows the First In First Out (FIFO) principle, meaning the first object added is the first
       to be handled.
       Queues are used for ordered operations and processing data.
       It's not possible to insert elements in the middle.


    Here are a few real-world examples:

    Queue Line: The person at the front of the line is served first.
    For example: think of how orders are processed in a fast-food restaurant.
    The first order placed is the first to be prepared and delivered.
    Ticket Queue: People wanting to buy tickets for a concert or event line up.
    Tickets are sold in order, and the first person in line gets their ticket first.
    Call Queue: Customers at a customer service call centre are connected to operators in order.
    The first caller waiting is served first, followed by the next in line.
    File Processing: Computer operating systems and applications process files in order.
    When one file process is completed, the next file in the queue is processed.


    The working principle of a queue is to add elements to the end of the queue and remove them from the beginning.
    Queues are useful when ordered operations or data are needed.

    The Queue interface can be implemented by different classes such as...
    1.	LinkedList (which can also use the List interface)
    2.	PriorityQueue

     */

        // How to create a Queue object?
        Queue<String> storage = new LinkedList<>();

        // 1. add() method adds the elements
        storage.add("Milk");
        storage.add("Eggs");
        storage.add("Bread");
        storage.add("Vegetables");
        storage.add("Fruit");
        storage.add("Juice");
        storage.add("Cheese");

        System.out.println("storage = " + storage); // [Milk, Eggs, Bread, Vegetables, Fruit, Juice, Cheese]

        // 2. remove() method removes and returns first element from the head of the Queue (FIFO)
        String firstElement = storage.remove();
        System.out.println("firstElement = " + firstElement); // Milk
        System.out.println("storage = " + storage); // [Eggs, Bread, Vegetables, Fruit, Juice, Cheese]

        // 3. peek() method returns first element from the head of the Queue but does NOT remove it.
        // It returns null if the queue is empty.
        System.out.println(storage.peek()); // Eggs
        System.out.println("storage = " + storage); // [Eggs, Bread, Vegetables, Fruit, Juice, Cheese]

        // 4. poll() method returns first element from the head of the Queue and ALSO removes it.
        // It returns null if the queue is empty.
        System.out.println(storage.poll()); // Eggs
        System.out.println("storage = " + storage);  // [Bread, Vegetables, Fruit, Juice, Cheese]

        // 5. element() method returns first element from the head of the Queue but does NOT remove it.
        System.out.println(storage.element()); // Bread
        System.out.println("storage = " + storage); // [Bread, Vegetables, Fruit, Juice, Cheese]


        // 6. clear() method clears all elements from the Queue making it empty.
        storage.clear();
        System.out.println("storage = " + storage); // []

        // After the Queue is empty
        System.out.println(storage.peek()); // null
        System.out.println(storage.poll()); // null
        // System.out.println(storage.element()); // throws NoSuchElementException

        // offer() method can also be used to add elements to the queue
        storage.offer("Honey");
        storage.offer("Crisps");
        System.out.println("storage = " + storage);


    }
}
