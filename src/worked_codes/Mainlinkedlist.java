package worked_codes;

import java.util.LinkedList;

public class Mainlinkedlist{
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the list
        list.add("Delhi");
        list.add("Bombay");
        list.add("kolkata");
        list.add("Tamil nadu");

        // Display the linked list
        System.out.println("Linked List Elements:");
        for (String item : list) {
            System.out.print(item + " -> ");
        }
        System.out.println("NULL");
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
}

