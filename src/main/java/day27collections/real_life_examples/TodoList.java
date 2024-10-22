package day27collections.real_life_examples;

import java.util.LinkedList;
public class TodoList {
    /*
    Scenario: To-Do List Management
In a to-do list application, users can manage their tasks by adding, removing, and viewing tasks.
A LinkedList is suitable here because it allows dynamic resizing and efficient insertions and deletions.

How it works:
TodoList class: Contains a LinkedList<String> to store the tasks.
addTask(): Adds a new task to the end of the list.
removeTask(): Removes a specified task from the list and handles cases where the task may not be found.
displayTasks(): Displays the current tasks in the to-do list.

     */

    private LinkedList<String> tasks;

    public TodoList() {
        tasks = new LinkedList<>();
    }

    // Add a new task
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added task: " + task);
    }

    // Remove a task
    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Removed task: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    // Display the current tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("Current To-Do List: ");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        // Adding tasks to the to-do list
        todoList.addTask("Buy groceries");
        todoList.addTask("Walk the dog");
        todoList.addTask("Finish homework");

        // Displaying the tasks
        todoList.displayTasks();

        // Removing a task from the to-do list
        todoList.removeTask("Walk the dog");
        todoList.displayTasks();

        // Attempting to remove a non-existing task
        todoList.removeTask("Go to the gym");
    }
}
