package worked_codes;

import java.util.LinkedList;

public class loop {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Delhi");
        list.add("Bombay");
        list.add("Kolkata");
        list.add("Tamil Nadu");

        // Display using get() in a for loop
        System.out.println("Displaying using get(index) in a for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        // Display using for-each loop
        System.out.println("\nDisplaying using for-each loop:");
        for (String item : list) {
            System.out.print(item + " -> ");
        }
        System.out.println("NULL");
    }
}
