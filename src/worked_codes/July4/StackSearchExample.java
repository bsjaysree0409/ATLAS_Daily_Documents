package July4;

import java.util.Stack;

public class StackSearchExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println("Stack: " + stack);

        // Search for an element
        int elementToFind = 300;
        int position = stack.search(elementToFind); // Position from top (1-based)

        if (position != -1) {
            System.out.println("Element " + elementToFind + " found at position (from top): " + position);
        } else {
            System.out.println("Element " + elementToFind + " not found in the stack.");
        }
    }
}
