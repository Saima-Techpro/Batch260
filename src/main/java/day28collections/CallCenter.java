package day28collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CallCenter {
    public static void main(String[] args) {
        /*
        How it works:
CustomerCall class: Each call has a customerName and a priority, where a lower number indicates a higher priority.
PriorityQueue: The queue organizes calls based on their priority, using a custom comparator
(Comparator.comparingInt(call -> call.priority)) to ensure that calls with
the lowest priority numbers are processed first.
Call processing: The poll() method retrieves and removes the call with the highest priority,
allowing customer service representatives to handle calls based on urgency.
         */
        // PriorityQueue to manage customer calls based on priority
        PriorityQueue<CustomerCall> callQueue = new PriorityQueue<>(Comparator.comparingInt(call -> call.priority));

        // Adding customer calls to the queue
        callQueue.add(new CustomerCall("Alice", 2));    // Medium priority
        callQueue.add(new CustomerCall("Bob", 1));      // High priority
        callQueue.add(new CustomerCall("Charlie", 3));  // Low priority
        callQueue.add(new CustomerCall("Dave", 1));     // High priority

        // Processing calls based on priority
        while (!callQueue.isEmpty()) {
            CustomerCall currentCall = callQueue.poll();  // Retrieve and remove the call with the highest priority (lowest number)
            System.out.println("Handling " + currentCall);
        }

    }
}
