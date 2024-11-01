package javapractice.miniproject_lambda.simple;

public class InventoryItem {
    private final String item;     // Name of the item
    private final int quantity;     // Quantity in stock
    private final double price;      // Price of the item

    // Constructor to initialize the fields
    public InventoryItem(String item, int quantity, double price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter for item name
    public String getItem() {
        return item;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Method to create a new InventoryItem with a modified quantity
    public InventoryItem withQuantity(int newQuantity) {
        return new InventoryItem(this.item, newQuantity, this.price);
    }
    /*
    Since the InventoryItem class is designed to be immutable (its fields cannot be changed after the object is created),
     this method allows you to create a new instance of InventoryItem with an updated quantity.
     It doesn't change the existing object; instead, it generates a new one with the specified changes.

    This method iterates through the inventory list to find the item by name.
    When the item is found, it creates a new InventoryItem with the updated quantity using the withQuantity method
    and replaces the old item in the list.
    This maintains immutability while allowing for updates.
     */

    // String representation of the InventoryItem
    @Override
    public String toString() {
        return "Item: " + item + ", Quantity: " + quantity + ", Price: " + price;
    }
}
/*
In this InventoryItem class, setters are not used because the class is designed to be immutable.
Here’s why immutability can be beneficial in this context:

1. Consistency of Data
By not allowing any modification of an InventoryItem instance’s fields after it's created, we ensure that each
InventoryItem object remains consistent and predictable throughout the program. This means once an item is created,
its attributes (like name, quantity, and price) cannot be changed unexpectedly by other parts of the code.

2. Thread Safety
Immutability makes InventoryItem inherently thread-safe because no thread can change the state of an
InventoryItem object. This can be very useful in concurrent or multithreaded applications, where the same
item might be accessed by different threads simultaneously.

3. Easier Maintenance and Testing
Immutable objects are easier to reason about since they have a fixed state after construction.
You don’t need to track how or where the fields might change over time, which simplifies debugging, testing, and maintenance.

4. Intention of the Class Design
In this case, InventoryItem represents an inventory entry that generally won't change directly. For instance:

If the quantity of an item changes, it’s likely the result of a business operation (like adding or removing stock)
and not a direct mutation of the item.
If prices or items need to be updated, it might be preferable to create a new InventoryItem object rather than
modifying an existing one.

How to Handle Changes without Setters?

If you need to update the InventoryItem (such as changing the quantity), you can create a new InventoryItem
instance with the updated values, rather than modifying an existing one. This maintains immutability while still
allowing "changes" by replacing old instances with new ones as needed.

 */
