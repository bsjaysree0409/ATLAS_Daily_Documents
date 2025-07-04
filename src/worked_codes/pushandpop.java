package worked_codes;

import java.util.LinkedList;

public class pushandpop {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Push elements onto the list (LIFO behavior)
        list.push("Delhi");
        list.push("Bombay");
        list.push("Kolkata");
        list.push("Tamil Nadu");

        // Display the linked list after pushes
        System.out.println("Linked List Elements after push (Top to Bottom):");
        System.out.println(list); // [Tamil Nadu, Kolkata, Bombay, Delhi]

        // Pop one element (should remove "Tamil Nadu")
        String poppedElement = list.pop();
        System.out.println("\nPopped Element: " + poppedElement);

        // Display the list after pop
        System.out.println("Linked List after pop:");
        System.out.println(list); // [Kolkata, Bombay, Delhi]

        // Print current first and last elements
        System.out.println("\nFirst Element (Top): " + list.getFirst());
        System.out.println("Last Element (Bottom): " + list.getLast());
    }
}
