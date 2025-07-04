package July4;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();


        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushes: " + stack);


        int popped = stack.pop();
        System.out.println("Popped element: " + popped);


        int top = stack.peek();
        System.out.println("Top element: " + top);


        System.out.println("Is stack empty? " + stack.isEmpty());


        System.out.println("Final stack: " + stack);
    }
}

