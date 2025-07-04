package July4;

import java.util.Stack;

public class Task7_PeekStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Check if stack is not empty before peeking
        if (!stack.isEmpty()) {
            int topElement = stack.peek(); // Peek returns the top without removing
            System.out.println("Top element (peek): " + topElement);
        } else {
            System.out.println("The stack is empty.");
        }
    }
}
