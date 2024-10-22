package day27collections.real_life_examples;

import java.util.LinkedList;

public class ShoppingCart {
    /*
    Scenario: Shopping Cart Management
In an online shopping application, users can add items to their shopping cart, remove items, and view their current cart contents.
 A LinkedList is suitable here because it allows dynamic resizing and efficient insertions and deletions.

 How it works:
ShoppingCart class: Contains a LinkedList<String> to store the items in the cart.
addItem(): Adds a new item to the end of the cart.
removeItem(): Removes a specified item from the cart and handles cases where the item may not be found.
displayCart(): Displays the current items in the shopping cart.


     */
    private LinkedList<String> cartItems;

    public ShoppingCart() {
        cartItems = new LinkedList<>();
    }

    // Add an item to the cart
    public void addItem(String item) {
        cartItems.add(item);
        System.out.println("Added item: " + item);
    }

    // Remove an item from the cart
    public void removeItem(String item) {
        if (cartItems.remove(item)) {
            System.out.println("Removed item: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }

    // Display the current items in the cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Current Shopping Cart: ");
            for (String item : cartItems) {
                System.out.println("- " + item);
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        // Adding items to the shopping cart
        shoppingCart.addItem("Laptop");
        shoppingCart.addItem("Wireless Mouse");
        shoppingCart.addItem("Headphones");

        // Displaying the items in the cart
        shoppingCart.displayCart();

        // Removing an item from the cart
        shoppingCart.removeItem("Wireless Mouse");
        shoppingCart.displayCart();

        // Attempting to remove a non-existing item
        shoppingCart.removeItem("Smartphone");
    }
}
