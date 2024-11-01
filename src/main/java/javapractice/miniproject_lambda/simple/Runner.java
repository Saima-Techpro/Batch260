package javapractice.miniproject_lambda.simple;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javapractice.miniproject_lambda.simple.InventoryManagement.*;

public class Runner {
    public static void main(String[] args) {

        List<InventoryItem> inventory = new ArrayList<>(Arrays.asList(
                new InventoryItem("apple", 10, 0.50),
                new InventoryItem("banana", 5, 0.20),
                new InventoryItem("orange", 8, 0.30),
                new InventoryItem("pear", 15, 0.40),
                new InventoryItem("grape", 12, 0.25)
        ));

        // Display all items
        System.out.println("Inventory Items:");
        displayInventory(inventory);

        // Add a new item
        addItem(inventory, new InventoryItem("kiwi", 20, 0.60));
        System.out.println("\nAfter Adding Kiwi:");
        displayInventory(inventory);

        // Remove an item
        removeItem(inventory, "banana");
        System.out.println("\nAfter Removing Banana:");
        displayInventory(inventory);

        // Update an item's quantity
        updateItemQuantity(inventory, "apple", 15);
        System.out.println("\nAfter Updating Apple Quantity to 15:");
        displayInventory(inventory);

        // Sort and display by name
        System.out.println("\nSorted by Name:");
        displayInventory(sortByKey(inventory, "item"));

        // Filter and display items based on minimum quantity
        System.out.println("\nFiltered by Minimum Quantity (>= 10):");
        displayInventory(filterByMinQuantity(inventory, 10));

        // Calculate and display the total value of the inventory
        System.out.println("\nTotal Inventory Value: " + totalInventoryValue(inventory));
    }



         /*
        we use the new InventoryItem constructor inside the Arrays.asList() method to create and initialize
        each InventoryItem object. This ensures that each object in the list is a fully constructed instance
        of the InventoryItem class.
        - InventoryItem is a class with a constructor that initializes its fields (item, quantity, price).
        - Using new InventoryItem(...) calls this constructor and creates a new instance of the InventoryItem
          class with the provided values.

         */



}
