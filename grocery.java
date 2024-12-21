// Grocery List Organizer
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListOrganizer {
    public static void main(String[] args) {
        // Create an empty list to store grocery items
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View list");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            if (choice == 1) {
                // Add an item to the list
                System.out.print("Enter item to add: ");
                String item = scanner.nextLine();
                groceryList.add(item);
                System.out.println("Item added successfully.");
            } else if (choice == 2) {
                // Remove an item from the list
                System.out.print("Enter item to remove: ");
                String item = scanner.nextLine();
                if (groceryList.contains(item)) {
                    groceryList.remove(item);
                    System.out.println("Item removed successfully.");
                } else {
                    System.out.println("Item not found.");
                }
            } else if (choice == 3) {
                // View the current list
                System.out.println("Current grocery list:");
                for (String groceryItem : groceryList) {
                    System.out.println(groceryItem);
                }
            } else if (choice == 4) {
                // Exit the program
                System.out.println("Goodbye!");
                break;
            } else {
                // Handle invalid menu options
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
