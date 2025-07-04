package July4;

import java.util.Stack;

public class Task8_CheckIfEmpty {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Check if stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is NOT empty.");
        }

        // Push an element
        stack.push(100);

        // Check again
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is NOT empty.");
        }
    }
}
