package worked_codes;

import java.util.LinkedList;
import java.util.Arrays;

public class linkedlisttoarray {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Delhi");
        list.add("Bombay");
        list.add("Kolkata");
        list.add("Tamil Nadu");

        // Convert LinkedList to Array
        Object[] array = list.toArray();

        // Display the array elements
        System.out.println("Linked List converted to Array:");
        for (Object item : array) {
            System.out.print(item + " -> ");
        }
        System.out.println("NULL");
    }
}
