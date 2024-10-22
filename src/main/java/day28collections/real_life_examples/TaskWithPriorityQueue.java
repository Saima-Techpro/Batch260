package day28collections.real_life_examples;


public class TaskWithPriorityQueue {  // Task class with priority
    /*
    A real-life example of a PriorityQueue (which implements Queue) is a task scheduling system in an operating
    system or other scheduling scenarios where tasks are prioritized.

Scenario: Job Scheduling in an Operating System
In an operating system, tasks (or processes) are often assigned priorities. Higher-priority tasks
get CPU time before lower-priority ones. A PriorityQueue can be used to manage the queue of tasks,
 where tasks with higher priority (numerically smaller values or higher weight) are executed first.

Tasks with the same priority may be processed in the order they were added, while higher-priority
tasks will always "jump the line" to be executed first.

This concept can be applied in other scenarios such as:

Print queues where some jobs are marked as urgent.
Emergency room patient management, where patients with more critical conditions are treated first.

How it works:
Task class (or TaskWithPriorityQueue class): Each task has a name and a priority (where a lower number indicates a higher priority).
PriorityQueue: The queue orders tasks based on their priority, using a custom comparator (Comparator.comparingInt(task -> task.priority)), so tasks with the smallest priority value are processed first.
Task processing: Tasks are added to the queue, and the poll() method retrieves and removes the task with the highest priority (smallest number).
     */
    String name;
    int priority; // Lower number means higher priority

    public TaskWithPriorityQueue(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task: " + name + " | Priority: " + priority;
    }
}
