package worked_codes;

import java.util.LinkedList;

public class Mainlinkedlist1 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Delhi");
        list.add("Bombay");
        list.add("Kolkata");
        list.add("Tamil Nadu");

        // Display the original linked list
        System.out.println("Original Linked List Elements:");
        for (String item : list) {
            System.out.print(item + " -> ");
        }
        System.out.println("NULL");

        // Remove 2 elements
        list.removeFirst(); // Removes "Delhi"
        list.removeLast(); // Removes "Kolkata"

        // Display the updated list
        System.out.println("\nAfter Removing 2 Elements:");
        for (String item : list) {
            System.out.print(item + " -> ");
        }
        System.out.println("NULL");

        // Print first and last elements
        if (!list.isEmpty()) {
            System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());
        }
    }
}
