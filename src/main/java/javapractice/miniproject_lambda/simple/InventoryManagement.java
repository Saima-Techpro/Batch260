package javapractice.miniproject_lambda.simple;

import java.util.List;
import java.util.stream.Collectors;

public class InventoryManagement {

    // Display all items
    public static void displayInventory(List<InventoryItem> inventory) {
        inventory.forEach(System.out::println);
    }

    // Add a new item to the inventory
    public static void addItem(List<InventoryItem> inventory, InventoryItem newItem) {
        inventory.add(newItem);
    }

    // Remove an item from the inventory by name
    public static void removeItem(List<InventoryItem> inventory, String itemName) {
        inventory.removeIf(item -> item.getItem().equalsIgnoreCase(itemName));
    }


    // Update an item's quantity in the inventory
    public static void updateItemQuantity(List<InventoryItem> inventory, String itemName, int newQuantity) {
        for (int i = 0; i < inventory.size(); i++) {
            InventoryItem item = inventory.get(i);
            if (item.getItem().equalsIgnoreCase(itemName)) {
                // Create a new InventoryItem with the updated quantity
                inventory.set(i, item.withQuantity(newQuantity));
                break; // Exit after updating the first match
            }
        }
    }

    // OR using for-each loop
    /*
    Note about for-each loop:
    Performance: While this approach works fine, using indexOf can lead to a performance hit if the list is large,
    as it searches through the list to find the index. In cases where performance is critical, it might be better to
    stick with the traditional for-loop approach or use an iterator.

    Immutable Pattern: This method adheres to the immutable design of InventoryItem, ensuring that the original
    instance remains unchanged while providing a new instance with the updated quantity.

     */
//    public static void updateItemQuantity(List<InventoryItem> inventory, String itemName, int newQuantity) {
//        for (InventoryItem item : inventory) {
//            if (item.getItem().equalsIgnoreCase(itemName)) {
//                // Create a new InventoryItem with the updated quantity
//                int index = inventory.indexOf(item); // Get the index of the item
//                inventory.set(index, item.withQuantity(newQuantity)); // Update the item
//                break; // Exit after updating the first match
//            }
//        }
//    }



    // Sort items by a specified key
    public static List<InventoryItem> sortByKey(List<InventoryItem> inventory, String key) {
        return inventory.stream().sorted((item1, item2) -> {
            switch (key) {
                case "item":
                    return item1.getItem().compareTo(item2.getItem());
                case "quantity":
                    return Integer.compare(item1.getQuantity(), item2.getQuantity());
                case "price":
                    return Double.compare(item1.getPrice(), item2.getPrice());
                default:
                    throw new IllegalArgumentException("Invalid key: " + key);
            }
        }).collect(Collectors.toList());
    }


   /*

Comparator Basics: A comparator decides the order of items by returning:

A negative number if the first item should come before the second.
Zero if they are considered equal in terms of ordering.
A positive number if the first item should come after the second.

In This Example:

If key is "item", it uses item1.getItem().compareTo(item2.getItem()), which orders items alphabetically.
If key is "quantity", it uses Integer.compare(item1.getQuantity(), item2.getQuantity()), ordering items by quantity.
If key is "price", it uses Double.compare(item1.getPrice(), item2.getPrice()), ordering by price.

     */

    // Filter items based on minimum quantity
    public static List<InventoryItem> filterByMinQuantity(List<InventoryItem> inventory, int minQuantity) {
        return inventory.stream()
                .filter(item -> item.getQuantity() >= minQuantity)
                .collect(Collectors.toList());
    }

    // Calculate the total value of the inventory
    public static double totalInventoryValue(List<InventoryItem> inventory) {
        return inventory.stream()
                .mapToDouble(item -> item.getQuantity() * item.getPrice())
                .sum();
    }



}
