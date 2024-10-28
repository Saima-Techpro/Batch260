package javapractice.miniproject4.RestaurantOrderProcessingSystem;

import java.util.*;

public class Restaurant {
    private List<Order> orders;

    public Restaurant() {
        this.orders = new ArrayList<>();
    }

    // Add a new order with input from the user
    public void addOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        // Display menu from TurkishDish enum
        System.out.println("\n--- Menu ---");
        for (TurkishDish dish : TurkishDish.values()) {
            System.out.printf("%-20s ₺%.2f - %s\n", dish.getName(), dish.getPrice(), dish.getDescription());
        }

        // Select items
        Map<TurkishDish, Integer> itemsOrdered = new EnumMap<>(TurkishDish.class);
        double subtotal = 0;

        while (true) {
            System.out.print("Enter item name to order (or type 'done' to finish): ");
            String itemName = scanner.nextLine().toUpperCase();

            if (itemName.equalsIgnoreCase("done")) break;

            try {
                TurkishDish dish = TurkishDish.valueOf(itemName);

                System.out.print("Enter quantity for " + dish.getName() + ": ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                itemsOrdered.put(dish, itemsOrdered.getOrDefault(dish, 0) + quantity);
                subtotal += dish.getPrice() * quantity;
                System.out.println(quantity + " x " + dish.getName() + " added to order.");

            } catch (IllegalArgumentException e) {
                System.out.println("Item not on the menu. Please try again.");
            }
        }

        // Calculate discount if applicable
        double discount = (subtotal >= 100) ? 0.10 * subtotal : 0;
        double totalCost = subtotal - discount;

        // Add order
        Order order = new Order(customerName, itemsOrdered, totalCost);
        orders.add(order);
        System.out.println("Order added for " + customerName + "!\n");
    }

    // Display all orders
    public void displayOrders() {
        System.out.println("\n--- Turkish Restaurant Orders ---");
        if (orders.isEmpty()) {
            System.out.println("No orders have been placed.");
        } else {
            for (Order order : orders) {
                System.out.println(order);
                System.out.println();
            }
        }
    }

    // Calculate total revenue without using lambda
    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Order order : orders) {
            totalRevenue += order.totalCost();
        }
        return totalRevenue;
    }
}