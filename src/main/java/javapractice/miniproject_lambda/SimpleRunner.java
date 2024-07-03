package javapractice.miniproject_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static javapractice.miniproject_lambda.SimpleInventoryManagement.*;

public class SimpleRunner {
    public static void main(String[] args) {

        List<InventoryItem> inventory = Arrays.asList(
                new InventoryItem("apple", 10, 0.50),
                new InventoryItem("banana", 5, 0.20),
                new InventoryItem("orange", 8, 0.30),
                new InventoryItem("pear", 15, 0.40),
                new InventoryItem("grape", 12, 0.25)
        );

        displayInventory(inventory);

        System.out.println("\nSorted by Name:");
        displayInventory(sortByKey(inventory, "item"));

        System.out.println("\nSorted by Quantity:");
        displayInventory(sortByKey(inventory, "quantity"));

        System.out.println("\nSorted by Price:");
        displayInventory(sortByKey(inventory, "price"));

        System.out.println("\nFiltered by Minimum Quantity (>= 10):");
        displayInventory(filterByMinQuantity(inventory, 10));

        System.out.println("\nTotal Inventory Value: " + totalInventoryValue(inventory));
    }



}
