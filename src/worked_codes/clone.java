package worked_codes;

import java.util.LinkedList;

public class clone {
    public static void main(String[] args) {
        // Original LinkedList
        LinkedList<String> originalList = new LinkedList<>();

        // Add elements
        originalList.add("Delhi");
        originalList.add("Bombay");
        originalList.add("Kolkata");
        originalList.add("Tamil Nadu");

        // Clone the linked list
        LinkedList<String> clonedList = (LinkedList<String>) originalList.clone();

        // Display original list
        System.out.println("Original Linked List:");
        System.out.println(originalList);

        // Display cloned list
        System.out.println("Cloned Linked List:");
        System.out.println(clonedList);

        // Modify original list to check independence
        originalList.remove("Bombay");
        clonedList.add("Chennai");

        System.out.println("\nAfter modifying both lists:");
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
    }
}
