package worked_codes;

import java.util.LinkedList;

public class NoLoop {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Delhi");
        list.add("Bombay");
        list.add("Kolkata");
        list.add("Tamil Nadu");

        // Display the linked list without using loops
        System.out.println("Linked List Elements:");
        System.out.println(list); // Implicitly calls list.toString()
    }
}
