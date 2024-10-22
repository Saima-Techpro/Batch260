package day28collections.real_life_examples;

import java.util.Comparator;
import java.util.PriorityQueue;


public class TaskScheduler {
    public static void main(String[] args) {
        // PriorityQueue with a custom comparator to prioritize tasks with lower priority number
        PriorityQueue<TaskWithPriorityQueue> taskQueue = new PriorityQueue<>(Comparator.comparingInt(task -> task.priority));

        // Adding tasks to the queue
        taskQueue.add(new TaskWithPriorityQueue("Low Priority Task", 5));
        taskQueue.add(new TaskWithPriorityQueue("High Priority Task", 1));
        taskQueue.add(new TaskWithPriorityQueue("Medium Priority Task", 3));

        // Processing tasks based on priority
        while (!taskQueue.isEmpty()) {
            TaskWithPriorityQueue currentTask = taskQueue.poll();  // Retrieve and remove the task with the highest priority (lowest number)
            System.out.println("Processing " + currentTask);
        }
    }
}
