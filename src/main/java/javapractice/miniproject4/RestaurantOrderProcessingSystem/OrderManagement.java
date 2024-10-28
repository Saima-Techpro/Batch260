package javapractice.miniproject4.RestaurantOrderProcessingSystem;

import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

public class OrderManagement {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Map<TurkishDish, Integer> items = new EnumMap<>(TurkishDish.class);

        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.println("\nMenu:");
        for (TurkishDish dish : TurkishDish.values()) {
            System.out.printf("%-20s ₺%.2f - %s\n", dish.getName(), dish.getPrice(), dish.getDescription());
        }

        String choice;

        do {
            System.out.print("\nEnter dish name to order (or type 'done' to finish): ");
            choice = scanner.nextLine().toUpperCase();

            try {
                TurkishDish dish = TurkishDish.valueOf(choice);

                System.out.print("Enter quantity for " + dish.getName() + ": ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume newline

                items.put(dish, items.getOrDefault(dish, 0) + quantity);
                System.out.println(quantity + " x " + dish.getName() + " added to your order.");

            } catch (IllegalArgumentException e) {
                if (!choice.equals("DONE")) {
                    System.out.println("Dish not found in menu. Please try again.");
                }
            }

        } while (!choice.equals("DONE"));

        Order order = new Order(customerName, items);
        System.out.println("\n" + order);
        scanner.close();
    }
}

