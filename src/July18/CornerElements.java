package July18;
/*
import java.util.*;

class Node {
    int data;
    Node1 left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class CornerElements {

    // Function to print corner elements at each level
    static void printCornerElements(Node1 root) {
        if (root == null) return;

        Queue<Node1> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node1 curr = queue.poll();

                // Print corner elements
                if (i == 0 || i == levelSize - 1) {
                    System.out.print(curr.data + " ");
                }

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }

            System.out.println(); // Newline for next level
        }
    }

    // Build the tree as per the image
    public static void main(String[] args) {
        Node1 root = new Node1(1);

        root.left = new Node1(2);
        root.right = new Node1(3);

        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        root.right.left = new Node1(6);
        root.right.right = new Node1(7);

        root.left.left.left = new Node1(8);
        root.left.left.right = new Node1(9);
        root.left.right.left = new Node1(10);
        root.left.right.right = new Node1(11);
        root.right.left.left = new Node1(12);
        root.right.left.right = new Node1(13);
        root.right.right.left = new Node1(14);
        root.right.right.right = new Node1(15);

        System.out.println("Corner elements of each level:");
        printCornerElements(root);
    }
}

*/